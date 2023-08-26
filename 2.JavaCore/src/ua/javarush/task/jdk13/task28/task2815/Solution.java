package ua.javarush.task.jdk13.task28.task2815;

import java.util.Random;
import java.util.concurrent.*;

/* 
Пакуємо лампочки
Розберися, що робить програма.

Допиши метод simulatingProducers. Він має додавати в чергу QUEUE 5 мільйонів лампочок.
Для нумерації лампочок можеш скористатися генератором випадкових чисел.
У методі main три рази викличи метод runProcess передаючи до нього різні ExecutorService.
Для створення ExecutorService скористайся методами newSingleThreadExecutor, newCachedThreadPool та newWorkStealingPool.

Requirements:
1. Метод simulatingProducers повинен додавати до QUEUE 5 мільйонів лампочок.
2. Метод main повинен тричі викликати метод runProcess, передаючи до нього три різних ExecutorService.
*/

public class Solution {

    private static final BlockingQueue<String> QUEUE = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        //напишіть тут ваш код
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService workStealingPool = Executors.newWorkStealingPool();
        runProcess(singleThreadExecutor);
        runProcess(newCachedThreadPool);
        runProcess(workStealingPool);
    }

    public static void runProcess(ExecutorService consumerService) {
        System.out.println("--------------------------------------");
        simulatingProducers();
        startConsumers(consumerService);
    }

    private static void simulatingProducers() {
        int maxProdBulbs = 5_000_000;
        Random rnd = new Random();
        System.out.println("Емулюємо роботу виробників...");
        System.out.println("Виробники виготовили " + maxProdBulbs + " лампочок...");

        //напишіть тут ваш код
        for (int i = 0; i < maxProdBulbs; i++) {
            QUEUE.offer("lamp" + rnd.nextInt(1000));
        }
    }

    private static void startConsumers(ExecutorService consumerService) {
        System.out.println("Для пакування використовується: " + consumerService.getClass().getSimpleName());

        int queueSize = QUEUE.size();
        Consumer consumer = new Consumer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < queueSize; i++) {
            consumerService.execute(consumer);
        }

        consumerService.shutdown();
        try {
            consumerService.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            System.out.println("Пакувальники спакували всі лампочки за " + (System.currentTimeMillis() - startTime) + " мс");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            String bulb = QUEUE.poll();
//            if (bulb != null) {
//                System.out.println("Упакована: " + bulb + " пакувальником: " + Thread.currentThread().getName());
//            }
        }
    }
}

/*

Методи offer() та add() в інтерфейсі BlockingQueue використовуються для додавання елементів до черги. Однак є різниця
в їх поведінці у випадку, коли черга досягла свого максимального розміру (заданого обмеження).

1) add():
Якщо черга досягла свого максимального розміру (виповнилася), то метод add() спробує додати елемент до черги.
Якщо черга вже заповнена і не може прийняти більше елементів, метод add() викине виключення IllegalStateException.

2) offer():
Метод offer() завжди спробує додати елемент до черги, навіть якщо черга вже заповнена (досягла максимального розміру).
Якщо черга заповнена і не може прийняти більше елементів, метод offer() просто поверне false, без виклику виключення.

У випадку, використання offer() забезпечує безпечну і більш гнучку операцію додавання елементів до черги, оскільки
вона не викине виключення, навіть якщо черга досягла свого максимального розміру.

*/