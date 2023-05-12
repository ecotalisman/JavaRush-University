package ua.javarush.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Collections;

/* 
Вивчаємо методи класу Collections, частина 1
У класі Solution оголошено методи: copy(ArrayList<String>, ArrayList<String>), addAll(ArrayList<String>, String…),
replaceAll(ArrayList<String>, String, String). Ти маєш переписати їхній код, використовуючи тільки відповідні методи
класу Collections.
Параметр String… означає те саме, що й String[], тільки аргументи String можна передавати через кому.


Requirements:
1. Клас Solution має містити публічний статичний метод copy(ArrayList<String>, ArrayList<String>), який не повертає
жодного значення (тип void).
2. Клас Solution має містити публічний статичний метод addAll(ArrayList<String>, String…), який не повертає жодного
значення (тип void).
3. Клас Solution має містити публічний статичний метод replaceAll(ArrayList<String>, String, String), який не повертає
жодного значення (тип void).
4. Метод copy(ArrayList<String>, ArrayList<String>) потрібно переписати, використовуючи метод copy класу Collections.
5. Метод addAll(ArrayList<String>, String…) потрібно переписати, використовуючи метод addAll класу Collections.
6. Метод replaceAll(ArrayList<String>, String, String) потрібно переписати, використовуючи метод replaceAll класу Collections.
*/

public class Solution {

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        // It was a condition:
//        if(destination.size() < source.size()) {
//            throw new IndexOutOfBoundsException("Source does not fit in dest");
//        }
//        for (int i = 0; i < source.size(); i++) {
//            destination.set(i, source.get(i));
//        }

        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        // It was a condition:
//        for (String string : strings) {
//            list.add(string);
//        }

        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        // It was a condition:
//        for (int i = 0; i < list.size(); i++) {
//            String string = list.get(i);
//            if(string.equals(oldValue)) {
//                list.set(i, newValue);
//            }
//        }

        Collections.replaceAll(list, oldValue, newValue);
    }
}
