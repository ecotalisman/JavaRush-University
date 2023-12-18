package ua.javarush.task.jdk13.task42.task4207;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
Арбайтен!

Запусти програму. Шестеро програмістів написали лише по 1000 рядків коду та вважали, що проєкт готовий. Але замовнику
цього недостатньо: він розраховує принаймні на сто тисяч рядків.

Реалізуй це за допомогою CountDownLatch:

1. У класі Developer додай приватне поле countDownLatch типу CountDownLatch.
2. У класі Developer додай до конструктора другий параметр типу CountDownLatch та ініціалізуй їм поле countDownLatch.
3. Код методу call оберни в цикл while, в якому перевір, що лічильник більше нуля. Використовуй метод getCount.
4. У методі call всередині циклу зменши лічильник на одиницю.
5. У методі main створи локальний об'єкт CountDownLatch, встановивши для нього значення 100.
Передай цей лічильник другим параметром до всіх конструктори Developer.

6. У методі main замість awaitTermination виклич у лічильника метод await без параметрів.

Requirements:
1. У класі Developer має бути поле countDownLatch, яке ініціалізується в конструкторі.
2. Цикл у методі call повинен продовжуватися, поки метод getCount лічильника повертає значення більше нуля.
3. Цикл у методі call повинен викликати метод countDown лічильника.
4. У методі main повинен створюватися лічильник зі значенням 100 і передаватися до всіх конструкторів Developer.
5. У методі main замість awaitTermination повинен викликатися метод await без параметрів у лічильника.
*/

public class Solution {

    public static ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger codeLines = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        List<Callable<Boolean>> developers = Stream
                .generate(() -> new Developer(codeLines, countDownLatch))
                .limit(6)
                .collect(toList());
        executor.invokeAll(developers);
        countDownLatch.await();
        executor.shutdownNow();
        System.out.println("Проект готовий!");
    }

    // It was a condition:
//    public static void main(String[] args) throws InterruptedException {
//        AtomicInteger codeLines = new AtomicInteger();
//        List<Callable<Boolean>> developers = Stream
//                .generate(() -> new Developer(codeLines)
//                .limit(6)
//                .collect(toList());
//        executor.invokeAll(developers);
//        executor.awaitTermination(1, TimeUnit.SECONDS);
//        executor.shutdownNow();
//        System.out.println("Проект готовий!");
//    }
}

