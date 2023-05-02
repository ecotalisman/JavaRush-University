package ua.javarush.task.pro.task12.task1211;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Сортування бульбашкою
Перед тобою програма, що сортує елементи списку за зростанням методом "бульбашки".
Перепиши код так, щоб замість списку ArrayList<Integer> numbers використовувався масив int[] numbers.
Методи main() і print() у перевірці не використовуються.


Requirements:
1. Тип поля numbers має бути int[].
2. Поле numbers має ініціалізуватися десятьма числами під час створення.
3. Метод sort() має сортувати елементи масиву int[] numbers за зростанням.
*/

public class Solution {

    // It was condition:
//    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));

    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nВідсортовані числа в порядку зростання:");
        print();
    }

    public static void sort() {

        // It was condition:
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            for (int j = 0; j < numbers.size() - i - 1; j++) {
//                if (numbers.get(j) > numbers.get(j + 1)) {
//                    int temp = numbers.get(j);
//                    numbers.set(j, numbers.get(j + 1));
//                    numbers.set(j + 1, temp);
//                }
//            }
//        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}

/*

В цьому коді використовується алгоритм сортування "бульбашкою". У цьому алгоритмі ми проходимо через масив кілька разів,
порівнюючи сусідні елементи. Якщо поточний елемент більший за наступний, ми міняємо їх місцями.

numbers.length - 1 використовується в першому циклі for для зменшення кількості ітерацій на одну. Це пов'язано з тим,
що ми порівнюємо кожен елемент з наступним, тому нам не потрібно порівнювати останній елемент сам з собою. Якщо ми не
зробимо це зменшення, ми можемо вийти за межі масиву при порівнянні останнього елемента з numbers[j + 1], коли j буде
останнім індексом масиву.

У другому циклі for ми використовуємо numbers.length - i - 1, щоб зменшити кількість ітерацій в процесі сортування.
З кожним проходом найбільший елемент "спливає" на своє місце (кінець масиву), тому ми можемо виключити ці відсортовані
елементи з наступних ітерацій. Зменшення i враховує кількість відсортованих елементів, які вже спливли на свої місця.

*/