package ua.javarush.task.jdk13.task28.task2802;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* 
ThreadLocalRandom
Клас Solution буде використовуватися тредами.
Реалізуй логіку всіх методів, використовуй клас ThreadLocalRandom.
getRandomIntegerBetweenNumbers повинен повертати випадковий int між from та to.
getRandomDouble повинен повертати випадковий double.
getRandomLongBetween0AndN повинен повертати випадковий long між 0 і n.

Requirements:
1. У класі Solution повинні бути лише статичні методи.
2. Метод getRandomIntegerBetweenNumbers за допомогою ThreadLocalRandom повинен повертати випадковий int [from..to].
3. Метод getRandomDouble за допомогою ThreadLocalRandom повинен повертати випадковий double [0..1).
4. Метод getRandomLongBetween0AndN за допомогою ThreadLocalRandom повинен повертати випадковий long [0..n].
*/

public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public static double getRandomDouble() {
        return ThreadLocalRandom.current().nextDouble(0, 1);
    }

    public static long getRandomLongBetween0AndN(long n) {
        return ThreadLocalRandom.current().nextLong(n);
    }

    public static void main(String[] args) {
    }
}
