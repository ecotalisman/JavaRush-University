package ua.javarush.task.jdk13.task16.task1611;

/* 
My first thread
Створити public static class TestThread - потік з інтерфейсом Runnable.
TestThread має виводити в консолі "My first thread".

Requirements:
1. Додай до класу Solution публічний статичний клас TestThread.
2. Клас TestThread має реалізувати інтерфейс Runnable.
3. Метод run класу TestThread має виводити "My first thread".
4. Програма має вивести "My first thread".
5. Метод main не змінюй.
*/

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}

/*

В Java, статичні вкладені класи (static nested classes) можуть бути створені виключно в інших верхньорівневих
(top-level) класах, а не в інтерфейсах або в інших вкладених класах.

Загальна структура виглядає так:

public class OuterClass {
    public static class NestedStaticClass {
        // fields and methods
    }
}

Однак, якщо ви спробуєте створити статичний клас на верхньому рівні (outside of any other class), так як ви намагаєтеся
зробити в вашому прикладі, компілятор Java видасть помилку. Верхній рівень класів в Java не можуть бути статичними.

Виправлений код може виглядати так:

public class SomeClass {
    public static class TestThread implements Runnable {
        @Override
        public void run() {
            // your code here
        }
    }
}

У цьому випадку TestThread є статичним вкладеним класом в SomeClass.

*/