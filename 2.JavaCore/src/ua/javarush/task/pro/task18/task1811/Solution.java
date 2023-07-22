package ua.javarush.task.pro.task18.task1811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Отримання потоку Stream
У цій задачі тобі потрібно реалізувати два методи так, щоб:

Публічний статичний метод getStreamFromArrayList(ArrayList<String>) повертав потік рядків зі списку рядків, отриманого
як аргумент.
Публічний статичний метод getStreamFromArray(Integer[] array) повертав потік чисел із масиву чисел, отриманого як аргумент.
Підказка:
Для отримання потоку даних із колекції потрібно викликати для неї метод stream().
Для отримання потоку даних із масиву потрібно викликати для класу java.util.Arrays статичний метод stream(), в який
передати масив.

Метод main() під час тестування не перевіряється.

Requirements:
1. Метод getStreamFromArrayList(ArrayList<String>) потрібно реалізувати згідно з умовою.
2. Метод getStreamFromArray(Integer[] array) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Літо", "Осінь");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        //напишіть тут ваш код - It was a condition:
//        return Stream.empty();

        //Write code here:
        return list.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        //напишіть тут ваш код - It was a condition:
//        return Stream.empty();

        // Write code here:
        return Arrays.stream(array);
    }
}
