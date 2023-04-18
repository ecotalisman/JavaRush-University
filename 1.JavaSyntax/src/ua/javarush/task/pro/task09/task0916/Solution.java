package ua.javarush.task.pro.task09.task0916;

/* 
String.format()
Реалізуй метод format(String name, int salary), який повертатиме такий рядок:
Мене звати <name>. Я зароблятиму $<salary> на місяць.

Скористайся для цього методом String.format().


Requirements:
1. Метод format(String, int) має використовувати метод String.format().
2. Метод format(String, int) має повертати рядок згідно з умовою задачі.
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Аміго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("Мене звати %s. Я зароблятиму $%d на місяць.", name, salary);
        //напишіть тут ваш код
        return phrase;
    }
}
