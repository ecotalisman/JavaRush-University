package ua.javarush.task.jdk13.task16.task1615;

import java.util.Date;

/* 
Поговоримо про музику
1. Зміни клас Violin таким чином, щоб він став таском для потоку. Використай інтерфейс MusicalInstrument
2. Реалізуй необхідний метод в потоці Violin. Реалізація має бути такою:
2.1. Рахуй час початку гри - метод startPlaying().
2.2. Почекай 1 секунду - метод sleepNSeconds(int n), де n - кількість секунд.
2.3. Рахуй час завершення гри - метод stopPlaying().
2.4. Виведи в консолі тривалість гри в мілісекундах. Використовуй методи з пунктів 2.1 и 2.3.

Приклад "Playing 1002 ms".

Requirements:
1. Клас Violin не має бути успадкований від якогось додаткового класу.
2. Клас Violin повинен реалізувати інтерфейс MusicalInstrument.
3. Метод run класу Violin має викликати метод startPlaying.
4. Метод run класу Violin має викликати метод sleepNSeconds з параметром 1 секунда.
5. Метод run класу Violin має викликати метод stopPlaying.
6. Метод run класу Violin має виводити в консолі тривалість гри в мілісекундах. Використовуй формат з прикладу.
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date startDate = startPlaying();
            sleepNSeconds(1);
            Date stopDate = stopPlaying();
            long playingTime = stopDate.getTime() - startDate.getTime();
            System.out.printf("Playing %d ms",playingTime);
        }
    }
}

/*

1) Зберігаємо результат виклику startPlaying() в змінну startDate перед викликом sleepNSeconds().
2) Зберігаємо результат виклику stopPlaying() в змінну stopDate після виклику sleepNSeconds().
3) Обчислюємо тривалість гри, використовуючи stopDate.getTime() - startDate.getTime().
4) Використовуємо це значення при форматуванні виведення.

Помилка була в тому, що знову викликали startPlaying() та stopPlaying() при виведенні, що викликало нові моменти
часу та перезаписувало повідомлення про гру. Замість цього потрібно зберегти початковий та кінцевий час гри:

@Override
        public void run() {
            startPlaying();
            sleepNSeconds(1);
            stopPlaying();
            System.out.printf("Playing %d ms",stopPlaying() - startPlaying());
        }

****************************************************************************************************************************

Функція getTime() в класі Date повертає значення у мілісекундах від 1 січня 1970 року (часова точка Unix) як long.

Коли ви виконуєте віднімання в виразі
System.out.printf("Playing %d ms",stopDate.getTime() - startDate.getTime());

ми отримуємо різницю в мілісекундах між двома датами. Результат цього віднімання також є long, оскільки обидва
операнди є long.

Використовуючи %d в рядку формату в методі printf, ви кажете Java вивести значення long як ціле число. Це працює,
оскільки long - це також тип цілого числа, хоча і з більшим діапазоном значень, ніж int. Таким чином, різниця між
датами виводиться в консоль як ціле число в мілісекундах.

*/