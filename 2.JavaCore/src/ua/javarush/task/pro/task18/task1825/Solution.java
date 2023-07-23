package ua.javarush.task.pro.task18.task1825;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/* 
З потоку даних до рядка
Потрібно, щоб метод getString(Stream<String>) перетворював вхідний потік рядків на рядок, слова в якому
розділені пробілами. Порядок слів у рядку має відповідати порядку елементів у потоці.
Реалізуй цей метод за допомогою методу collect() об'єкта типу Stream<String>. Як параметр передай потрібний колектор
(об'єкт типу Collector<String>). Такий об'єкт можна отримати, викликавши статичний метод joining() класу Collectors.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getString(Stream<String>) потрібно викликати статичний метод joining()
класу Collectors.
2. Метод getString(Stream<String>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        //напишіть тут ваш код
//        return "";

        // Change code here:
        return stringStream.collect(Collectors.joining(" "));
    }
}
