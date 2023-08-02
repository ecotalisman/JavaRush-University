package ua.javarush.task.jdk13.task16.task1612;

/* 
My second thread
1. Створити public static клас TestThread, який успадковано від Thread.
2. Створити статік блок всередині TestThread, який виводить в консолі "it's a static block inside TestThread".
3. Метод run має виводити в консолі "it's a run method".

Requirements:
1. Додай до класу Solution публічний статичний клас TestThread.
2. Клас TestThread потрібно успадкувати від класу Thread.
3. Клас TestThread має реалізовувати будь-які додаткові інтерфейси.
4. Створити статік блок всередині TestThread, який виводить в консолі "it's a static block inside TestThread".
5. Метод run класу TestThread має виводити "it's a run method".
6. Метод main не змінюй.
*/

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}
