package ua.javarush.task.pro.task18.task1810;

import java.util.ArrayList;
import java.util.Collections;

/* 
Перетворення списку на масив
У класі Solution є два публічні статичні методи:

String[] toStringArray(ArrayList<String>), в якому потрібно перетворити список рядків на масив рядків і повернути його;
Integer[] toIntegerArray(ArrayList<Integer>), в якому потрібно перетворити список чисел на масив чисел і повернути його.
Для перетворення списку на масив використовуй метод списку toArray(), в який потрібно передати посилання на конструктор
масиву, тип якого відповідає типу списку.
Метод main() під час тестування не перевіряється.

Requirements:
1. У методі toStringArray(ArrayList<String>) для списку, отриманого як аргумент, потрібно викликати метод toArray(),
в який передається посилання на конструктор масиву, тип якого відповідає типу списку.
2. Потрібно, щоб метод toStringArray(ArrayList<String>) повертав масив рядків із тими самими елементами в тому самому
порядку, що й в отриманому списку.
3. У методі toIntegerArray(ArrayList<Integer>) для списку, отриманого як аргумент, потрібно викликати метод toArray(),
в який передається посилання на конструктор масиву, тип якого відповідає типу списку.
4. Потрібно, щоб метод toIntegerArray(ArrayList<Integer>) повертав масив чисел із тими самими елементами в тому самому
порядку, що й в отриманому списку.
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ти", "ж", "програміст");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        //напишіть тут ваш код - the code was like this:
//        return new String[]{};

        // Change code here:
        return strings.toArray(String[]::new);
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //напишіть тут ваш код - the code was like this:
//        return new Integer[]{};

        //Change code here:
        return integers.toArray(Integer[]::new);
    }
}
