package ua.javarush.task.pro.task18.task1808;

import java.util.ArrayList;
import java.util.Collections;

/* 
Знайомство з посиланнями на методи
У класі Solution публічний метод print(ArrayList<String>) виводить у консоль усі елементи списку підряд.
Наразі метод реалізовано з використанням методу списку forEach(), який отримує лямбда-вираз. Потрібно переписати
реалізацію методу print(ArrayList<String>) так, щоб метод списку forEach() замість лямбда-виразу отримував посилання на метод.

Метод main() під час тестування не перевіряється.

Requirements:
1. У методі print(ArrayList<String>) потрібно використати метод списку forEach(), який отримує посилання на метод.
2. У методі print(ArrayList<String>) потрібно виводити в консоль усі елементи отриманого списку підряд.
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        // The code was like this:
//        strings.forEach(string -> System.out.println(string));

        // Change code here:
        strings.forEach(System.out::println);
    }
}
