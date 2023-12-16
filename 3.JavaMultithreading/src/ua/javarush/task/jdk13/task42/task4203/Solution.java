package ua.javarush.task.jdk13.task42.task4203;

import java.util.*;
import java.util.concurrent.*;

/* 
10 плюс 20 буде 20
Розберися, що має робити програма. Виправ її таким чином, щоб у підсумку в списку було 20 чисел.

Оптимізуй код програми за допомогою одного з методів CopyOnWriteArrayList.

Requirements:
1. Клас Solution повинен містити private final поле Integer[] ARRAY.
2. Клас Solution повинен містити private final поле CopyOnWriteArrayList<Integer> LIST.
3. У результаті роботи програми у списку LIST має бути 20 елементів.
4. У методі main потрібно викликати метод addIfAbsent об'єкта LIST (щонайменше 20 разів).
*/

public class Solution {
    private static final int THREAD_POOL_SIZE = 10;
    private static final int COUNT = 20;
    private static final int TIMEOUT = 10;

    private static final Integer[] ARRAY = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // It was a condition:
//    private static final List<Integer> LIST = new ArrayList<>(List.of(ARRAY));

    private static final CopyOnWriteArrayList<Integer> LIST = new CopyOnWriteArrayList<>(List.of(ARRAY));

    public static void main(String[] args) throws InterruptedException {
        System.out.print("List before: ");
        printList(LIST);

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 1; i <= COUNT; i++) {
            final Integer element = i;
            Runnable task = () -> {

                LIST.addIfAbsent(element);

                // It was a condition:
//                boolean isAbsent = true;
//                for (Integer integer : LIST) {
//                    if (integer.equals(element)) {
//                        isAbsent = false;
//                        break;
//                    }
//                }
//                if (isAbsent) {
//                    LIST.add(element);
//                }

            };
            executor.submit(task);
        }

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);

        executor.shutdown();

        System.out.print("List  after: ");
        printList(LIST);
    }

    private static void printList(List<Integer> list) {
        String delimiter = "";
        for (Integer integer : list) {
            System.out.print(delimiter + integer);
            delimiter = ", ";
        }
        System.out.println();
    }
}
