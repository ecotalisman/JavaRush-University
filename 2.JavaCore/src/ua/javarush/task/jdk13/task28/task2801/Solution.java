package ua.javarush.task.jdk13.task28.task2801;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишемо свою ThreadFactory
У класі Solution створи публічний статичний клас AmigoThreadFactory, який реалізує інтерфейс ThreadFactory.
1. Реалізація інтерфейсного методу - створи та поверни тред, який повинен:
1.1. не бути демоном,
1.2. мати нормальний приорітет,
1.3. ім'я треда повинне мати шаблон "GN-pool-A-thread-B",
де GN - це ім'я групи,
A - це номер фабрики, інкрементується в межах класу починаючи з 1, використовуй AtomicInteger,
B - номер треду інкрементується в межах конкретної фабрики починаючи 1, використовуй AtomicInteger.
2. Кожна фабрика повинна мати ту групу тредів (ThreadGroup), у якій її створено.
3. Методи main і emulateThreadFactory не беруть участі в тестуванні.

Приклад виведення:
secondGroup-pool-2-thread-1
firstGroup-pool-1-thread-1
firstGroup-pool-1-thread-3
secondGroup-pool-2-thread-3
firstGroup-pool-1-thread-2
secondGroup-pool-2-thread-2

Requirements:
1. У класі Solution потрібно створити клас public static AmigoThreadFactory, який реалізує інтерфейс ThreadFactory.
2. Фабрика AmigoThreadFactory має створювати треди, які не є демоном.
3. Фабрика AmigoThreadFactory має створювати треди, які мають нормальний пріоритет.
4. Фабрика AmigoThreadFactory має створювати імена для тредів за шаблоном "GN-pool-A-thread-B".
5. Кожна фабрика повинна виробляти треди з групою (ThreadGroup), у якій вона була створена.
*/

public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        private static final AtomicInteger factoryNumber = new AtomicInteger(0);
        private final AtomicInteger threadNumber = new AtomicInteger(0);
        private final ThreadGroup group;
        private final int currentFactoryNumber;

        public AmigoThreadFactory() {
            currentFactoryNumber = factoryNumber.incrementAndGet();
            group = Thread.currentThread().getThreadGroup();
        }

        @Override
        public Thread newThread(Runnable r) {
            String threadName = String.format("%s-pool-%d-thread-%d",
                    group.getName(), currentFactoryNumber, threadNumber.incrementAndGet());

            Thread thread = new Thread(group, r, threadName);
            thread.setDaemon(false);
            thread.setPriority(Thread.NORM_PRIORITY);
            return thread;
        }
    }


    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }
}


/*

Реалізуємо фабрику тредів за вимогами завдання:

1. Створення AtomicInteger для номера фабрики та номера треду в межах фабрики:
Це потрібно для того, щоб кожен раз, коли створюється новий тред або нова фабрика, вони мали унікальні номери.

2. Створення конструктора для AmigoThreadFactory:
Конструктор повинен інкрементувати номер фабрики та визначати групу потоків для цієї фабрики.

3. Реалізація методу newThread:

- Спершу інкрементуємо номер треду.
- Далі створюємо тред із поточною групою потоків, переданим Runnable об'єктом та іменем, що формується за вказаним шаблоном.
- Встановлюємо для треда необхідні параметри (не демон, нормальний пріоритет).
- Повертаємо створений тред.

Тепер є фабрика потоків AmigoThreadFactory, яка створює потоки з відповідними іменами, у вказаній групі потоків, і
відповідає іншим вимогам завдання.

Коли запустити emulateThreadFactory(), вона створить та запустить три потоки за допомогою нашої фабрики, і кожен
потік виведе своє ім'я у консоль.

****************************************************************************************************************************

                        Розглянемо кожний елемент в класі AmigoThreadFactory:

                                1. Статичні та нестатичні змінні:

private static final AtomicInteger factoryNumber = new AtomicInteger(0);
private final AtomicInteger threadNumber = new AtomicInteger(0);
private final ThreadGroup group;
private final int currentFactoryNumber;

   * factoryNumber - це статичний AtomicInteger, який використовується для того, щоб присвоювати кожній новій фабриці її
унікальний номер. Оскільки він статичний, він спільний для всіх об'єктів класу AmigoThreadFactory.

   * threadNumber - це AtomicInteger, який використовується для присвоєння унікального номера кожному новому треду,
створеному конкретною фабрикою. Оскільки він не статичний, кожна фабрика матиме свій екземпляр цієї змінної.

   * group - ця змінна зберігає групу потоків, в якій була створена фабрика.

   * currentFactoryNumber - зберігає унікальний номер конкретної фабрики, отриманий з factoryNumber.


                                2. Конструктор:

public AmigoThreadFactory() {
    currentFactoryNumber = factoryNumber.incrementAndGet();
    group = Thread.currentThread().getThreadGroup();
}

   * currentFactoryNumber = factoryNumber.incrementAndGet(); - інкрементуємо factoryNumber та зберігаємо отримане
значення у currentFactoryNumber для поточної фабрики.

   * group = Thread.currentThread().getThreadGroup(); - отримуємо групу потоків поточного потоку (того, який створив
цю фабрику) та зберігаємо її у group.


                                3. Метод newThread:

public Thread newThread(Runnable r) {
    String threadName = String.format("%s-pool-%d-thread-%d", group.getName(), currentFactoryNumber,
                                        threadNumber.incrementAndGet());
    Thread thread = new Thread(group, r, threadName);
    thread.setDaemon(false);
    thread.setPriority(Thread.NORM_PRIORITY);
    return thread;
}

 * String threadName = ... - формуємо ім'я для нового потоку за заданим шаблоном, використовуючи ім'я групи потоків,
номер поточної фабрики та інкрементований номер потоку.

 * Thread thread = new Thread(group, r, threadName); - створюємо новий потік із заданою групою потоків, об'єктом
Runnable та іменем.

 * thread.setDaemon(false); - встановлюємо тред як не демонічний.
 * thread.setPriority(Thread.NORM_PRIORITY); - встановлюємо нормальний приорітет для потоку.
 * return thread; - повертаємо створений тред.

Ця фабрика практична для створення потоків, які легко ідентифікувати завдяки їх іменам та в яких можна контролювати
додаткові параметри, такі як приорітет і статус демона.

****************************************************************************************************************************

                                Пояснення цих методів:

                                 1. incrementAndGet():

- Де використовується: цей метод належить до класу AtomicInteger.
- Що робить: збільшує поточне значення на 1 та повертає збільшене значення. Важливо відзначити, що ця операція атомарна.
Це означає, що при багатопоточному використанні змінна буде безпечно інкрементована без конфліктів між потоками.

- Приклад: Якщо поточне значення AtomicInteger є 5 і ви викликаєте incrementAndGet(), то його значення стане 6 і це
нове значення буде повернено.

                            2. setPriority(int newPriority):

- Де використовується: цей метод належить до класу Thread.
- Що робить: встановлює приорітет потоку. Приорітет потоку визначає порядок виконання потоків відносно інших потоків.
В Java є попередньо визначені константи для рівнів приорітетів: Thread.MIN_PRIORITY, Thread.NORM_PRIORITY і Thread.MAX_PRIORITY.

- Приклад: Якщо ви викликаєте setPriority(Thread.NORM_PRIORITY) для потоку, йому буде встановлено середній
приорітет (який дорівнює 5).

                            3. setDaemon(boolean on):

- Де використовується: також метод класу Thread.
- Що робить: встановлює поток як демонічний або не демонічний. Якщо потік є демонічним, він не заважатиме завершенню
роботи програми, коли всі інші не демонічні потоки завершать роботу. На відміну від цього, якщо є хоча б один не
демонічний потік, який все ще працює, програма не завершить роботу.

- Приклад: Якщо ви викликаєте setDaemon(true) для потоку, цей поток стане демонічним. Якщо ви закінчите роботу всіх
інших не демонічних потоків, програма завершиться, незважаючи на те, що демонічний потік ще працює.

****************************************************************************************************************************

                                1. AtomicInteger:
- Належить до: java.util.concurrent.atomic пакету.
- Опис: Це клас, який забезпечує атомарні операції на цілому числі (int). "Атомарність" означає, що операції виконуються
як неподільний процес, і тому вони безпечні для використання в багатопоточному оточенні без необхідності синхронізації.

- Приклад використання: коли вам потрібно інкрементувати або декрементувати змінну в багатопоточному середовищі без
використання synchronized блоків.

                                2. ThreadFactory:
- Належить до: java.util.concurrent пакету.
- Опис: Це інтерфейс, який визначає метод для створення нових потоків. Зазвичай він використовується у специфічних
середовищах, таких як пули потоків (Executor фреймворк), де вам потрібно мати більший контроль над тим, як створюються потоки.

- Приклад використання: коли ви хочете створити певний пул потоків, де кожен потік має певні характеристики, такі
як ім'я, приорітет або статус демона. Замість використання стандартних налаштувань потоку, ви можете використовувати
ThreadFactory для надання своїх налаштувань для кожного нового потоку, який створюється.

Обидва ці класи часто використовуються в Java, особливо в багатопоточних або паралельних програмах, для ефективного
керування потоками і забезпечення коректної роботи в умовах конкуренції між потоками.

*/