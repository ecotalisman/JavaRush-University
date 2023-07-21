package ua.javarush.task.pro.task18.task1807;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощання з foreach
У класі Solution публічний метод print(ArrayList<String>) виводить у консоль усі елементи списку підряд.
Наразі метод реалізовано з використанням методу списку forEach(). Потрібно переписати реалізацію методу
print(ArrayList<String>), використовуючи оператор for. Логіку роботи методу змінювати не можна.

Метод main() під час тестування не перевіряється.

Requirements:
1. У методі print(ArrayList<String>) потрібно використати оператор for.
2. У методі print(ArrayList<String>) не слід використовувати метод списку forEach().
3. У методі print(ArrayList<String>) потрібно виводити в консоль усі елементи отриманого списку підряд.
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

        // Change code:
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
