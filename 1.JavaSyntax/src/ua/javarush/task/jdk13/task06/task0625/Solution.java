package ua.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Мінімальна сума
У класі Solution дано двовимірний масив цілих чисел (поле array) розмірністю 3х3. У методі main потрібно
заповнити порядково цей масив даними з клавіатури, порахувати суму елементів у кожному стовпці та у кожному
рядку і вивести найменшу із цих сум на екран.


Requirements:
1. У програмі потрібно зчитувати 9 чисел із клавіатури.
2. Масив array необхідно заповнити числами, введеними з клавіатури.
3. У програмі потрібно вивести на екран мінімальну суму елементів у рядку чи стовпці.
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int minSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            if (minSum > rowSum) {
                minSum = rowSum;
            }
        }

        for (int j = 0; j < array[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < array.length; i++) {
                colSum += array[i][j];
            }
            if (minSum > colSum) {
                minSum = colSum;
            }
        }

        System.out.println(minSum);
    }
}
