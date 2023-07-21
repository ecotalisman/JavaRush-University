package ua.javarush.task.pro.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощання з лямбда-виразом
Перед тобою програма, що сортує список рядків за їх довжиною в порядку зростання.
Це робить метод sortStringsByLength(ArrayList<String>). Для сортування рядків використовується метод
Collections.sort(ArrayList<String>, Comparator<String>), який отримує список рядків і компаратор у вигляді лямбда-виразу.

Твоє завдання — переписати реалізацію методу sortStringsByLength(ArrayList<String>) так, щоб замість лямбда-виразу
використовувався клас StringComparator, який реалізує інтерфейс Comparator<String>, не змінюючи логіку роботи методу
sortStringsByLength(ArrayList<String>).

Тобто потрібно, щоб у класі StringComparator метод int compare(String s1, String s2) повертав числове значення
згідно з цими умовами:

від'ємне число, якщо довжина рядка s1 менша за довжину рядка s2;
додатне число, якщо довжина рядка s1 більша за довжину рядка s2;
0, якщо довжина рядків s1 і s2 однакова.
Метод main() під час тестування не перевіряється.

Requirements:
1. В окремому файлі потрібно створити публічний клас StringComparator, який реалізує інтерфейс Comparator<String>.
2. У класі StringComparator потрібно створити публічний метод int compare(String s1, String s2).
3. Метод compare(String s1, String s2) потрібно реалізувати згідно з умовою.
4. У методі sortStringsByLength(ArrayList<String>) потрібно сортувати список рядків за зростанням їх довжини.
5. У методі sortStringsByLength(ArrayList<String>) для сортування списку рядків за зростанням їх довжини потрібно
використовувати власний компаратор (об'єкт типу StringComparator).
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        // The code was like this:
//        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());

        // Change code here:
        Collections.sort(strings, new StringComparator());
    }
}
