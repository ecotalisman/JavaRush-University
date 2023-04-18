package ua.javarush.task.jdk13.task06.task0623;

/* 
Знайомство з двовимірним масивом
У класі Solution проініціалізуй поле array значенням двовимірного масиву цілих чисел розмірністю 2х3.
У методі main заповни цей масив цілими числами (крім 0) і виведи на екран.

Requirements:
1. Поле array класу Solution необхідно проініціалізувати значенням двовимірного масиву цілих чисел розмірністю 2х3.
2. Цей масив необхідно заповнити будь-якими цілими числами, крім 0.
3. У програмі потрібно вивести елементи масиву, кожен елемент з нового рядка.
*/

import java.util.Random;

public class Solution {
    public static int[][] array;//напишіть тут ваш код

    public static void main(String[] args) {
        //напишіть тут ваш код
        Random random = new Random();
        array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(99 + 1);
                System.out.println(array[i][j]);
            }
        }
    }
}
