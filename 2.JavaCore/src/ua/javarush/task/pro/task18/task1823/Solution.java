package ua.javarush.task.pro.task18.task1823;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/* 
З потоку даних до множини
Потрібно, щоб метод getFilteredStrings(Stream<String>) перетворював вхідний потік рядків на множину рядків, довжина
яких перевищує шість символів.
Реалізуй його за допомогою методу collect() об'єкта типу Stream<String>. Як параметр передай потрібний колектор
(об'єкт типу Collector<Set<String>>). Такий об'єкт можна отримати, викликавши статичний метод toSet() класу Collectors.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getFilteredStrings(Stream<String>) потрібно викликати статичний метод toSet()
класу Collectors.
2. Метод getFilteredStrings(Stream<String>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //напишіть тут ваш код
//        return new HashSet<>();

        // Change code here:
        return stringStream.filter(str -> str.length() > 6)
                .collect(Collectors.toSet());
    }
}
