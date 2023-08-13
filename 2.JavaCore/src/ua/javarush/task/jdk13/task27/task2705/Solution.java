package ua.javarush.task.jdk13.task27.task2705;

import java.util.Set;

/* 
Прибираємо deadLock за допомогою використання відкритих викликів
Синхронізовані методи, які викликають всередині себе синхронізовані методи інших класів, призводять до dead-lock-у.
1. Перенесіть синхронізацію з методу до синхронізованого блоку, в якому розмістіть лише необхідні частини коду.
2. Приберіть надлишкову синхронізацію методів.
3. У стеку виклику методів не повинно бути перехресної синхронізації, тобто такого
synchronizedMethodAClass().synchronizedMethodBClass().synchronizedMethodAClass()

Цей спосіб позбавлення від дедлоку називається "відкриті виклики", про них читайте у додатковому матеріалі до лекції.
Метод main не бере участі в тестуванні.

Requirements:
1. Потрібно забезпечити можливість коректної взаємодії об'єктів типу Apartment і RealEstate без виникання
взаємних блокувань.
2. Метод up класу RealEstate потрібно оголосити без модифікатора synchronized.
3. Метод revalidate класу RealEstate потрібно оголосити без модифікатора synchronized.
4. Метод revalidate класу Apartment потрібно оголосити без модифікатора synchronized.
5. Метод revalidate класу RealEstate має містити один synchronized блок.
6. У synchronized блоці методу revalidate класу RealEstate має міститися виклик методу revalidate на об'єкті apartment
з параметром randomValue.
*/

public class Solution {
    public static void main(String[] args) {
        final long deadline = System.currentTimeMillis() + 5000; //waiting for 5 sec

        final RealEstate realEstate = new RealEstate();
        Set<Apartment> allApartments = realEstate.getAllApartments();

        final Apartment[] apartments = allApartments.toArray(new Apartment[allApartments.size()]);

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        realEstate.revalidate();
                    }
                }
            }, "RealEstateThread" + i).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < apartments.length; i++) {
                        apartments[i].revalidate(true);
                    }
                }
            }, "ApartmentThread" + i).start();
        }

        Thread deamonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (System.currentTimeMillis() < deadline) {

                }
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Deadlock occurred");
            }
        });
        deamonThread.setDaemon(true);
        deamonThread.start();
    }
}

/*

код прагне вирішити проблему deadlock (взаємної блокування), який виникає, коли два чи більше потоки намагаються
отримати блокування на різних ресурсах у різному порядку. Щоб уникнути цього, необхідно забезпечити, що потоки завжди
забиратимуть блокування в одному й тому ж порядку.

Отже, взявши до уваги код і порівнюючи його з наданим прикладом KnightUtil:

class KnightUtil
{
 public static void kill(Knight knight1, Knight knight2)
 {
  Knight knightMax = knight1.id > knight2.id ? knight1: knight2;
  Knight knightMin = knight1.id > knight2.id ? knight2: knight1;

  synchronized(knightMax)
  {
   synchronized(knightMin)
   {
    knight2.live = 0;
    knight1.experience +=100;
   }
  }
 }
}

давайте розберемося з кодом:

1) RealEstate: було додано synchronized блок у методі revalidate, щоб синхронізувати дії над кожним Apartment. Це вірно,
але можливо занадто обережно. Ви фактично блокуєтеся на кожній окремій квартирі, коли перевіряєте її. Це може зменшити
швидкість виконання вашої програми.

2) Apartment: Метод revalidate тепер викликає метод up у класі RealEstate. Але якщо інший потік вже синхронізувався на
цьому екземплярі RealEstate, це може призвести до deadlock.

Отже, як це можна виправити:

1) У RealEstate класі, замість синхронізації на кожній квартирі у методі revalidate, можемо просто викликати метод
revalidate квартири без синхронізації. Квартира потім сама вирішить, чи потрібно їй виконати які-небудь дії.

2) У Apartment класі, замість виклику realEstate.up(this) безпосередньо, ви можете використовувати "відкритий виклик".
Це означає, що ви копіюєте посилання на поточний екземпляр realEstate до локальної змінної, виходите з синхронізованого
контексту, а потім використовуєте цю локальну змінну для виклику методу. Це запобігає перехресній синхронізації.

Ось приклад, як це можна реалізувати:

public class Apartment {
    private String location;
    private final RealEstate realEstate;

    public Apartment(RealEstate realEstate) {
        this.realEstate = realEstate;
        setLocation(String.valueOf(Math.random() * 10));
    }

    public String getLocation() {
        synchronized(this) {
            return location;
        }
    }

    public void setLocation(String location) {
        synchronized(this) {
            this.location = location;
        }
    }

    public void revalidate(boolean isEmpty) {
        if (isEmpty) {
            RealEstate localRealEstate = this.realEstate;
            localRealEstate.up(this);
        }
    }
}

Зауважимо, що було додано синхронізацію до геттера та сеттера location, і замість синхронізації всього методу
revalidate, просто використано "відкритий виклик" для realEstate.up(this).

****************************************************************************************************************************
synchronized(this) vs synchronized(location)
****************************************************************************************************************************

Ключове слово synchronized використовує об'єкт як "монітор" або "блокування". Коли потік входить в синхронізований блок
з даним монітором, жоден інший потік не може ввійти в інший синхронізований блок, який використовує той же монітор,
до тих пір, поки перший потік не вийде зі свого блоку.

* synchronized(this):
Це блокує на поточний об'єкт (this). Тобто, якщо один потік входить в синхронізований блок коду
для об'єкта Apartment, жоден інший потік не може ввійти в інший синхронізований блок цього ж об'єкта, доки перший
потік не вийде.

* synchronized(location):
Це блокує на об'єкт location. Якщо location є рядком, це може бути особливо проблематичним,
оскільки рядки в Java є незмінними, і вони можуть бути збережені в пулі рядків. Це означає, що різні об'єкти Apartment
можуть випадково мати ту саму рядкову змінну location, яка вказує на той же рядок в пам'яті, що призводить до небажаної
синхронізації між незалежними об'єктами.

Висновок:
У випадку метода setLocation, якщо ви використовуєте synchronized(location), існує проблема. Оскільки ви намагаєтеся
синхронізувати блокування на поточному значенні location, а потім змінюєте його (this.location = location;), ви фактично
змінюєте об'єкт, на якому синхронізуєтеся. Це може призвести до непередбачуваної поведінки і є поганою практикою.

Тому коректніше використовувати synchronized(this) для синхронізації на всьому об'єкті Apartment, якщо вам потрібно
гарантувати атомарність дій на його полях.

*/