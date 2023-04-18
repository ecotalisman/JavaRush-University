package ua.javarush.task.pro.task06.task0612;

/* 
Усе має коріння
Метод printSqrt(int[] array) має виводити квадратний корінь із кожного елемента масиву, переданого в метод.
Однак цього не відбувається через конфлікт імен змінних. Виправ імена змінних так, щоб код компілювався.
У результаті роботи програма має виводити в консоль відповідний рядок для кожного елемента масиву.

Приклад рядка:
Квадратний корінь із числа 64 дорівнює 8.0


Requirements:
1. Код має компілюватися.
2. Метод printSqrt(int[] array) для кожного елемента масиву має виводити рядок згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Квадратний корінь із числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqr = Math.sqrt(element);
            System.out.println(elementSqrt + element + " дорівнює " + elementSqr);
        }
    }
}
