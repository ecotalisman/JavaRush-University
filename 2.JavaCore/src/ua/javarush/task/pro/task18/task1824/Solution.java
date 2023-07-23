package ua.javarush.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
З потоку даних до map
Потрібно, щоб метод getMap(Stream<String>) перетворював вхідний потік рядків на мапу (map), ключем якої є сам рядок,
а значенням — його довжина.
Реалізуй цей метод за допомогою методу collect() об'єкта типу Stream<String>. Як параметр передай потрібний колектор
(об'єкт типу Collector<Map<String, Integer>>). Такий об'єкт можна отримати, викликавши статичний метод toMap()
класу Collectors.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getMap(Stream<String>) потрібно викликати статичний метод toMap() класу Collectors.
2. Метод getMap(Stream<String>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //напишіть тут ваш код
//        return new HashMap<>();

        // Change code here:
        return stringStream.collect(Collectors.toMap(s -> s, String::length));
    }
}
