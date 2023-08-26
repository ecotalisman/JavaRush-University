package ua.javarush.task.jdk13.task28.task2812;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* 
ShutdownNow!
Розберися, в чому відмінність методів shutdown і shutdownNow. Виведи список усіх незавершених завдань на екран.

Має вийти щось типу:

pool-1-thread-1, localId=1
pool-1-thread-2, localId=2
pool-1-thread-3, localId=3
pool-1-thread-4, localId=4
pool-1-thread-5, localId=5
java.util.concurrent.FutureTask@7e6cbb7a... was not completed
java.util.concurrent.FutureTask@7c3df479... was not completed
java.util.concurrent.FutureTask@7106e68e... was not completed
java.util.concurrent.FutureTask@7eda2dbb... was not completed
java.util.concurrent.FutureTask@6576fe71... was not completed

Requirements:
1. У методі main класу Solution потрібно викликати метод shutdownNow на об'єкті executor.
2. У методі main класу Solution на екран потрібно вивести всі завдання, які не встиг виконати executor.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            final int localId = i;
            executor.submit(() -> doExpensiveOperation(localId));
        }

        // Add code here:
        List<Runnable> runnables = executor.shutdownNow();
        Thread.sleep(100);
        for (Runnable r : runnables) {
            System.out.println(r.toString() + " was not completed");
        }

        // Using Stream API:
//        runnables.stream()
//                .forEach(future -> System.out.println(future + " was not completed"));

    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}

/*

Отримавши список runnables з методу executor.shutdownNow(), ви отримуєте список об'єктів типу Runnable. Ці об'єкти
представляють завдання, які були в черзі для виконання в пулі потоків, але не встигли бути виконані через закриття
пулу за допомогою shutdownNow().

Після цього ви за допомогою циклу for-each проходитеся по кожному об'єкту Runnable в списку runnables і викликаєте
метод toString() для кожного з них. Це дає вам можливість отримати рядкове представлення кожного об'єкта Runnable,
яке ви виводите на екран разом з текстом " was not completed". Таким чином, ви виводите на екран назву об'єкта разом
з повідомленням, що він не був виконаний.

*/