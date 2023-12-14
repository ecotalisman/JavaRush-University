package ua.javarush.task.jdk13.task42.task4202;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/* 
Хто перший встав, того й капці

На змаганнях 5 спортсменів одночасно стріляють в одну ціль. Якщо хтось у неї влучає, ціль руйнується, інші в неї вже
не можуть стріляти.

Але щось пішло не так. Виправ програму, щоб інші потоки "бачили" зміни значення змінної isHit і більше його не змінювали.

Скористайся AtomicBoolean та його методами.

Requirements:
1. Клас Solution повинен містити приватне поле AtomicBoolean isHit.
2. Метод void run() класу Shooter повинен змінювати значення поля isHit на true, якщо воно дорівнювало false.
3. Виведення на екран має закінчуватися фразою "Did someone hit? true".
*/

public class Solution {
    private static final int COUNT = 5;
    private static final int TIMEOUT = 10;
    private static AtomicBoolean isHit = new AtomicBoolean(false);

    // It was a condition:
//    private static Boolean isHit = false;

    public static void main(final String[] arguments) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(COUNT);

        for (int i = 1; i <= COUNT; i++) {
            Solution.Shooter shooter = new Solution.Shooter(i);
            executor.submit(shooter);
        }

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);

        executor.shutdown();
    }

    static class Shooter implements Runnable {
        private int id;

        public Shooter(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        @Override
        public void run() {
            System.out.println("Did someone hit? " + isHit);
            if (isHit.compareAndSet(false, true)) {
                System.out.println("The shooter #" + id + " hit!");
                System.out.println("Did someone hit? " + isHit);
            }
        }

        // It was a condition:
//        @Override
//        public void run() {
//            System.out.println("Did someone hit? " + isHit);
//            if (!isHit) {
//                System.out.println("The shooter #" + id + " hit!");
//                isHit = true;
//                System.out.println("Did someone hit? " + isHit);
//            }
//        }
    }
}
