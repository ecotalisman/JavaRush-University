package ua.javarush.task.pro.task18.task1809;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощання з посиланнями на методи
У класі Solution публічний метод print(ArrayList<Integer>) виводить у консоль усі елементи списку підряд.
Наразі метод реалізовано з використанням методу списку forEach(), який отримує посилання на метод. Потрібно
переписати реалізацію методу print(ArrayList<Integer>) так, щоб метод списку forEach() замість посилання на метод
отримував лямбда-вирази.

Метод main() під час тестування не перевіряється.

Requirements:
1. У методі print(ArrayList<Integer>) потрібно використати метод списку forEach(), який отримує лямбда-вирази.
2. У методі print(ArrayList<Integer>) потрібно виводити в консоль усі елементи отриманого списку підряд.
*/

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        // The code was a like:
//        numbers.forEach(System.out::println);

        // Change code here:
        numbers.forEach(str -> System.out.println(str));
    }
}
