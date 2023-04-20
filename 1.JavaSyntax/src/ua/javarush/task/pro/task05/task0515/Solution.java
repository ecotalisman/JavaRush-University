package ua.javarush.task.pro.task05.task0515;

import java.util.Arrays;

/* 
Порівняння двовимірних масивів
Виправ роботу методу main(String[]), який виводить в консоль true, якщо arrayFirst дорівнює arraySecond, інакше — false.

Requirements:
1. Якщо arrayFirst дорівнює arraySecond, то метод main(String[]) виводить у консоль true.
2. Якщо arrayFirst не дорівнює arraySecond, то метод main(String[]) виводить у консоль false.
*/

public class Solution {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}
