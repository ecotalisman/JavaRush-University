package ua.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

/* 
Максимальний елемент
У класі Solution дано двовимірний масив цілих чисел (поле array) розмірністю 3х3. У методі main потрібно заповнити
порядково цей масив даними з клавіатури та вивести на екран максимальний елемент масиву.


Requirements:
1. У програмі потрібно зчитувати 9 чисел із клавіатури.
2. Масив array необхідно заповнити числами, введеними з клавіатури.
3. У програмі необхідно вивести максимальний елемент масиву на екран.
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
