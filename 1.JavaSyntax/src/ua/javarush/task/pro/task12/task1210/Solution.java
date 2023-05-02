package ua.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Перевертання даних
Ти бачиш робочу програму, в якій масив int[] numbers заповнюється числами в методі init(). Потім у методі reverse()
відбувається переставляння чисел у зворотному порядку.
Твоє завдання — переписати код так, щоб замість масиву int[] numbers використовувався список ArrayList<Integer> numbers.
Імена методів і змінних не слід змінювати.
Методи main() і print() у перевірці не використовуються.


Requirements:
1. Поле numbers повинно мати тип ArrayList<Integer>.
2. Метод init() має заповнювати список numbers числами від 0 до 9.
3. Метод reverse() має переставити значення списку numbers у зворотному порядку.
*/

public class Solution {

    // It was condition:
//    public static int[] numbers = new int[10];

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {

            // It was condition:
//            numbers[i] = i;

            numbers.add(i);
        }
    }

    public static void reverse() {

        // It was condition:
//        int n = numbers.length - 1;
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[n - i];
//            numbers[n - i] = temp;
//        }
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
