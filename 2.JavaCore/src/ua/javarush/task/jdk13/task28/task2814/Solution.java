package ua.javarush.task.jdk13.task28.task2814;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/* 
Збір статистики
Реалізуй метод invokeMillionTasks. Тобі потрібно:

створити колекцію, яка мільйон разів міститиме об'єкт, що передано як параметр task;
за допомогою методу invokeAll передати колекцію в cachedPool.

Requirements:
1. Метод invokeMillionTasks повинен викликати у ExecutorService метод invokeAll, передавши туди колекцію, що
складається з мільйона об'єктів task.
*/

public class Solution {

    public static ExecutorService cachedPool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception {
        Callable<String> task = () -> {
            Thread.sleep(100);

            return "Done";
        };

        printStatistic();
        invokeMillionTasks(task);
        printStatistic();
        shutdown();
    }

    public static void invokeMillionTasks(Callable<String> task) throws Exception {
        //напишіть тут ваш код
        List<Callable<String>> callables = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            callables.add(task);
        }

        cachedPool.invokeAll(callables);
    }

    public static void printStatistic() {
        ThreadPoolExecutor pool = (ThreadPoolExecutor) cachedPool;

        System.out.println("-------------------------------------------");
        System.out.println("Найбільше число потоків, що одночасно знаходяться в пулі: "
                + pool.getLargestPoolSize());
        System.out.println("Максимально можлива кількість потоків у пулі: "
                + pool.getMaximumPoolSize());
        System.out.println("Нинішня кількість потоків у пулі: "
                + pool.getPoolSize());
        System.out.println("Кількість запланованих завдань: "
                + pool.getTaskCount());
    }

    public static void shutdown() throws Exception {
        cachedPool.shutdown();
        boolean isTerminated = cachedPool.awaitTermination(100, TimeUnit.MILLISECONDS);
        if (!isTerminated) {
            cachedPool.shutdownNow();
        }
    }
}

/*

1. У циклі ви створюєте колекцію callables, яка складається з мільйона об'єктів task.
2. Після створення колекції callables ви використовуєте метод cachedPool.invokeAll(callables) для виклику всіх завдань одразу.

Це дозволить викликати мільйон завдань із списку callables за допомогою invokeAll.

*/