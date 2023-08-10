package ua.javarush.task.jdk13.task16.task1626;

/* 
А без interrupt слабо?
Розберися, як працює програма.
Реалізуй метод ourInterruptMethod таким чином, щоб він переривав потік TestThread. Виправ інший код програми, якщо це
необхідно. Не можна використовувати метод interrupt.

Requirements:
1. У класі Solution повинен бути публічний статичний метод ourInterruptMethod без параметрів.
2. Метод run повинен виводити надпис "he-he" кожні півсекунди, допоки не викличеться метод ourInterruptMethod.
3. Необхідно змінити умову циклу while в методі run.
4. Метод main має створювати об'єкт типу Thread під час передачі до конструктора об'єкту типу TestThread.
5. Метод main повинен викликати метод start в об'єкта типу Thread.
6. Метод main повинен викликати метод ourInterruptMethod.
*/

public class Solution {
    // Add code here variable `volatile`
    private static volatile boolean isCancel = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isCancel = true;
    }

    public static class TestThread implements Runnable {
        public void run() {

            // It was a condition:
//            while (true) {
//                try {
//                    System.out.println("he-he");
//                    Thread.sleep(500);
//                } catch (InterruptedException ignore) {
//                }
//            }

            //Change code here:
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
            }
        }
    }
}
