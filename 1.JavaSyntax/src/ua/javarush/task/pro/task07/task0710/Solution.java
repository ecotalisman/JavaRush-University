package ua.javarush.task.pro.task07.task0710;

/* 
Масив значень
Часто перед початком використання масиву його потрібно заповнити значеннями за замовчуванням.
Реалізуй таке заповнення в методі fillArray(Integer[] array, int value).
Як аргументи метод отримує масив і значення, якими потрібно заповнити комірки масиву.
Масив слід заповнити цілком, незалежно від його довжини.

Requirements:
1. Метод fillArray(Integer[] array, int value) має заповнювати переданий у нього масив значенням value.
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        //напишіть тут ваш код
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
