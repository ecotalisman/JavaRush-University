package ua.javarush.task.jdk13.task16.task1621;

/* 
Big Ben clock
1. Розберися, що робить програма.
2. Реалізуй логіку методу printTime таким чином, щоб кожну секунду показувався час починаючи із заданого в конструкторі
(час, який передали до конструктора, не потрібно виводити).

Приклад:
У м. Лондон зараз 23:59:58!
У м. Лондон зараз 23:59:59!
У м. Лондон зараз опівночі!
У м. Лондон зараз 0:0:1!

Requirements:
1. Метод printTime має працювати приблизно секунду.
2. Метод printTime повинен збільшувати (інкрементувати) кількість секунд, яке зберігається у змінній seconds.
3. Секунд після інкременту часу не може бути більше за 59. Має збільшуватися кількість хвилин.
4. Хвилин після інкременту часу не може бути більше за 59. Має збільшуватися кількість годин.
5. Годин після інкременту часу не може бути більше за 23.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException ignore) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут
            // Інкрементуємо секунди
            seconds++;

            // Перевіряємо чи секунди дорівнюють 60, якщо так - обнуляємо секунди та інкрементуємо хвилини
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }

            // Те саме робимо для хвилин
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }

            // Те саме робимо для годин
            if (hours == 24) {
                hours = 0;
            }

            // Чекаємо секунду перед наступним виведенням
            Thread.sleep(1000);

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В м. %s зараз опівночі!", cityName));
            } else {
                System.out.println(String.format("В м. %s зараз %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }
    }
}

/*

В Java, лямбда-вирази в основному використовуються для представлення анонімних функцій. Вони часто використовуються
в контексті колекцій або потоків, і вони є коротшим способом представлення одного методу інтерфейсу.

Наш код - це послідовність інструкцій, яка визначає, як змінюється стан змінних. Це не є функціональним стилем,
який можна б легко замінити лямбда-виразами.

Однак, якщо ми дійсно хочемо використовувати лямбда-вирази для представлення цієї логіки, можна зробити це дещо
незвичайним способом:

// Лямбда-вирази для інкрементування і обнулення
Runnable increaseSeconds = () -> {
    seconds++;
    if (seconds == 60) {
        seconds = 0;
        minutes++;
    }
};

Runnable increaseMinutes = () -> {
    if (minutes == 60) {
        minutes = 0;
        hours++;
    }
};

Runnable increaseHours = () -> {
    if (hours == 24) {
        hours = 0;
    }
};

// Виклик лямбда-виразів
increaseSeconds.run();
increaseMinutes.run();
increaseHours.run();

Потрібно зауважити, що цей підхід не додає жодних переваг з точки зору продуктивності або читабельності. У більшості
випадків використання прямих if умов буде більш зрозумілим та ефективним.

*/