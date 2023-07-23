package ua.javarush.task.pro.task18.task1822;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
З потоку даних до списку
Для розв'язання цієї задачі потрібно, щоб метод getPositiveNumbers(Stream<Integer>) перетворював вхідний потік чисел
на список чисел, більших за нуль.
Реалізуй його за допомогою методу collect() об'єкта типу Stream<Integer>. Як параметр передай потрібний колектор
(об'єкт типу Collector<List<Integer>>). Такий об'єкт можна отримати, викликавши статичний метод toList() класу Collectors.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getPositiveNumbers(Stream<Integer>) потрібно викликати статичний метод
toList() класу Collectors.
2. Метод getPositiveNumbers(Stream<Integer>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        //напишіть тут ваш код - It was a condition:
//        return new ArrayList<>();

        // Change code here:
        return numbers.filter(n -> n > 0)
                .collect(Collectors.toList());
    }
}
