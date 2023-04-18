package ua.javarush.task.pro.task06.task0605;

/* 
Правильний порядок
Напишімо утиліту для роботи з масивами. Основна частина функціоналу готова: метод printArray() виводить у консоль усі елементи масиву.
Залишилася дрібниця: реалізувати метод reverseArray(). Він має змінювати порядок елементів масиву на зворотний.
Метод має працювати лише з масивами цілочислових значень (int[]).

Приклад:
Якщо масив містив елементи:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
то після виклику методу reverseArray() повинен містити:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1


Requirements:
1. Метод reverseArray() має змінювати порядок елементів масиву на зворотний.
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишіть тут ваш код
        int[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = copy[copy.length - 1 - i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
