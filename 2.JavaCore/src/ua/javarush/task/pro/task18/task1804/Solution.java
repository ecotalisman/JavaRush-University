package ua.javarush.task.pro.task18.task1804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Знайомство з лямбда-виразом
Перед тобою програма, що сортує список чисел за зростанням.
Метод sortNumbers(ArrayList<Integer>) отримує список, елементи якого потрібно відсортувати. Для сортування
використовується метод Collections.sort(ArrayList<Integer>, Comparator<Integer>), де параметри — це список
чисел і компаратор.

Твоє завдання — переписати реалізацію методу sortNumbers(ArrayList<Integer>) так, щоб замість внутрішнього
анонімного класу Comparator<Integer> використовувався лямбда-вираз.

Метод main() під час тестування не перевіряється.

Requirements:
1. Заміни внутрішній анонімний клас Comparator<Integer> на лямбда-вираз.
2. У методі sortNumbers(ArrayList<Integer>) потрібно сортувати список чисел за зростанням.
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {

        // It was a condition:
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1 - i2;
//            }
//        };
//        Collections.sort(numbers, comparator);

        // Change code here:
        Comparator<Integer> comparator = (i1, i2) -> i1 - i2;


        Collections.sort(numbers, comparator);
    }
}
