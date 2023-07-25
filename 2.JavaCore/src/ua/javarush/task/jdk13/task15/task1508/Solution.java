package ua.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
У статичному блоці ініціалізуй labels п'ятьма різними парами ключ-значення.

Requirements:
1. У класі Solution повинен бути лише один метод — main().
2. У класі Solution потрібно оголосити статичне поле labels типу Map.
3. Поле labels потрібно заповнити 5 різними парами ключ-значення в статичному блоці.
4. Метод main повинен виводити вміст labels на екран.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    // Write code here:
    static {
        labels.put(1.1, "H");
        labels.put(1.2, "E");
        labels.put(1.3, "L");
        labels.put(1.4, "L");
        labels.put(1.5, "O");
    }

    public static void main(String[] args) {

        // It was a condition:
        System.out.println(labels);

        // It doesn't work for plugin JavaRush:
//        labels.forEach((k,v) -> System.out.println(k + " - " + v));
    }
}
