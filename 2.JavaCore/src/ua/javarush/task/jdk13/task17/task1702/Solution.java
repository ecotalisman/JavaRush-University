package ua.javarush.task.jdk13.task17.task1702;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Разом швидше? Зараз перевіримо :)
1. Розберися, що та як працює.
2. Створи public static потік SortThread, який в методі run відсортує статичний масив testArray за допомогою методу sort.

Requirements:
1. Клас Solution повинен містити public static клас SortThread.
2. Клас SortThread має бути потоком.
3. У методі run класу SortThread має викликати метод sort() з параметром testArray.
4. Програма повинна виводити текст на екран.
*/

public class Solution {
    public static int threadCount = 10;
    public static int[] testArray = new int[1000];

    static {
        for (int i = 0; i < Solution.testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static class SortThread extends Thread {
        @Override
        public void run() {
            sort(testArray);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuilder expectedResult = new StringBuilder();
        for (int i = 1000 - 1; i >= 0; i--) {
            expectedResult.append(i).append(" ");
        }

        initThreads();

        StringBuffer result = new StringBuffer();
        for (int i : testArray) {
            result.append(i).append(" ");
        }
        System.out.println(result);
        System.out.println((result.toString()).equals(expectedResult.toString()));
    }

    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<>(threadCount);
        for (int i = 0; i < threadCount; i++) {
            threads.add(new SortThread());
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }
}

