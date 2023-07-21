package ua.javarush.task.pro.task18.task1806;

import java.util.ArrayList;
import java.util.Collections;

/* 
Знайомство з foreach
У класі Solution публічний метод print(ArrayList<Integer>) виводить у консоль усі елементи списку підряд.
Наразі метод реалізовано з використанням оператора for. Потрібно переписати реалізацію методу print(ArrayList<Integer>),
використовуючи метод списку forEach(), який отримує лямбда-вираз. Логіку роботи методу print(ArrayList<Integer>)
змінювати не потрібно.

Метод main() під час тестування не перевіряється.

Requirements:
1. У методі print(ArrayList<Integer>) потрібно використати метод списку forEach(), який отримує лямбда-вираз.
2. У методі print(ArrayList<Integer>) не слід використовувати оператор for.
3. У методі print(ArrayList<Integer>) потрібно виводити в консоль усі елементи отриманого списку підряд.
*/

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        // The code was like this:
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

        // Change code:
        numbers.forEach(s -> System.out.println(s));
    }
}
