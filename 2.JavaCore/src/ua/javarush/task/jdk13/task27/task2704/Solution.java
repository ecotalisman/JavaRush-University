package ua.javarush.task.jdk13.task27.task2704;

/* 
Прибираємо deadlock
За допомогою стратегії уникання deadlock-у зроби так, щоб він не виник.
Метод main не бере участі в тестуванні.
Дій по аналогії з прикладом з лекцій.
Зміни внеси лише до safeMethod.

Requirements:
1. Метод safeMethod не повинен викликати deadlock при використанні з різних потоків.
2. У методі safeMethod має бути виклик методу unsafeMethod, з тими самими аргументами.
3. У методі safeMethod має бути виклик методу longTimeMethod.
4. У методі safeMethod має бути два блоки synchronized.
*/

import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {
    public void safeMethod(Object obj1, Object obj2) {
        // Write code here:
        Object objMax = obj1.hashCode() > obj2.hashCode() ? obj1 : obj2;
        Object objMin = obj1.hashCode() > obj2.hashCode() ? obj2 : obj1;

        // Using Stream
//        Object objMaxStream = Stream.of(obj1, obj2)
//                .max(Comparator.comparingInt(Object::hashCode))
//                .orElse(obj1);
//
//        Object objMinStream = Stream.of(obj1, obj2)
//                .min(Comparator.comparingInt(Object::hashCode))
//                .orElse(obj2);

        synchronized (objMax) {
            longTimeMethod();
            synchronized (objMin) {
                unsafeMethod(obj1, obj2);
            }
        }
    }

    public void longTimeMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    protected void unsafeMethod(Object obj1, Object obj2) {
        System.out.println(obj1 + " " + obj2);
    }

    public static void main(String[] args) {
        final Object o1 = new Object();
        final Object o2 = new Object();
        final Solution solution = new Solution();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o1, o2);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                solution.safeMethod(o2, o1);
            }
        }.start();
    }
}
