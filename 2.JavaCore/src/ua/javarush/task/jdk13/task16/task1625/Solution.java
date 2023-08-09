package ua.javarush.task.jdk13.task16.task1625;

/* 
Знову interrupt
Створи потік TestThread.
У методі main створи екземпляр потоку, запусти, а потім перерви його за допомогою методу interrupt().

Requirements:
1. Клас TestThread потрібно успадкувати від Thread.
2. Клас TestThread повинен мати public void метод run.
3. Метод main повинен створювати об'єкт типу TestThread.
4. Метод main повинен викликати метод start в об'єкта типу TestThread.
5. Метод main повинен викликати метод interrupt в об'єкта типу TestThread.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишіть тут ваш код
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //напишіть тут ваш код
    public static class TestThread extends Thread {

        @Override
        public void run() {
            super.run();
        }
    }
}