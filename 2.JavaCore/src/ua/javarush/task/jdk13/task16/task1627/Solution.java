package ua.javarush.task.jdk13.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
Один для всіх, всі - для одного
1. Розберися, як працює програма.
1.1. Зверни увагу, що об'єкт Water - один для всіх потоків.
2. Реалізуй метод ourInterruptMethod, щоб він переривав усі потоки з threads (використовуй метод interrupt).
3. У методі run виправ значення змінних:
3.1. isCurrentThreadInterrupted - має дорівнювати значенню методу isInterrupted у нинішньому потоці.
3.2. threadName - має дорівнювати значенню методу getName (реалізовано в класі Thread) у нинішньому потоці.

Requirements:
1. Метод ourInterruptMethod повинен перервати всі потоки зі списку threads.
2. Метод run має отримувати нинішні потоки за допомогою статичного метода Water.getCurrentThread().
3. Метод run повинен використовувати метод isInterrupted нинішнього потоку.
4. Метод run повинен використовувати метод getName нинішнього потоку.
5. Метод main має працювати приблизно 3 сек.
*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static void ourInterruptMethod() {
        //напишіть тут ваш код
        threads.forEach(Thread::interrupt);
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - виправ 2 змінні

            // It was a condition:
//            boolean isCurrentThreadInterrupted = false;
//            String threadName = "";

            // Change code here:
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = getCurrentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    // It was a condition:
//                    System.out.println("Об'єкт " + sharedResource + ", потік " + threadName);

                    // Change code here:
                    System.out.println("Об'єкт " + sharedResource + ", потік " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignore) {
            }
        }

        public static Thread getCurrentThread() {
            return Thread.currentThread();
        }
    }
}

/*

Щоб вирішити цю задачу, потрібно зробити декілька змін:

1) Метод ourInterruptMethod():
потрібно перервати всі потоки зі списку threads. Це можна зробити, проходячись по списку threads і викликаючи метод
interrupt() для кожного потоку.

2) Метод run() в класі Water:
a. Виправити значення змінної isCurrentThreadInterrupted на Thread.currentThread().isInterrupted(), що повертає true,
якщо потік було перервано.

b. Виправити значення змінної threadName на Thread.currentThread().getName(), що повертає ім'я поточного потоку або
використати метод getCurrentThread() для змінної
threadName = getCurrentThread().getName();

*/