package ua.javarush.task.jdk13.task16.task1620;

/* 
Годинник
1. Розберися з тим, що робить програма.
2. Реалізуй логіку метода printTikTak:
2.1. Через перші півсекунди в консолі має виводитися фраза: Tik
2.2. Через наступні півсекунди в консолі має виводитися фраза: Tak

Requirements:
1. Метод printTikTak повинен виводити два рядки: "Tik" і "Tak".
2. Метод printTikTak повинен працювати приблизно секунду.
3. Метод printTikTak повинен два рази заснути на півсекунди. Використовуй метод Thread.sleep(500).
4. У консолі не має бути повідомлень після фрази "Double-check".
5. Метод main повинен створювати об'єкт типу Clock.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException ignore) {
            }
        }

        private void printTikTak() throws InterruptedException {
            //add your code here - добавь код тут
            Thread.sleep(500);
            System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");
        }
    }
}
