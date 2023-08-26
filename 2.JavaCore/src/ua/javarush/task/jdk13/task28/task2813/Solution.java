package ua.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
Кешування потоків
У методі main ініціалізуй поле executorService за допомогою методу newCachedThreadPool.

Реалізуй методи submitProducers і submitConsumers. У методі submitProducers додай до сервісу executorService сто
завдань Producer.

До всіх конструкторів Producer передай різні рядки.

У методі submitConsumers додай до сервісу executorService сто завдань Consumer. Оскільки у Consumer нема стану
(нема полів), використовуй один об'єкт Consumer 100 разів.

Requirements:
1. Поле executorService потрібно ініціалізувати в методі main за допомогою методу newCachedThreadPool.
2. Метод submitProducers має додати до executorService сто завдань типу Producer.
3. Метод submitConsumers має додати до executorService сто завдань типу Consumer.
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        executorService = Executors.newCachedThreadPool();

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() {
        //напишіть тут ваш код
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Producer("" + i));
        }
    }

    public static void submitConsumers() {
        //напишіть тут ваш код
        Consumer consumer = new Consumer();
        for (int i = 0; i < 100; i++) {
            executorService.submit(consumer);
        }
    }
}
