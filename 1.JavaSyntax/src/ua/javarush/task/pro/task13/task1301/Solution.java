package ua.javarush.task.pro.task13.task1301;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* 
Повертаємо своє
У класі Solution є метод arrayToHashSet(String[]), який має з переданого масиву повернути HashSet<String> з тими самими елементами.
Метод main у перевірці не використовується.


Requirements:
1. Клас Solution має містити метод public static HashSet<String> arrayToHashSet(String[]).
2. Метод arrayToHashSet(String[]) слід реалізувати згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "роки", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишіть тут ваш код
        HashSet<String> hashSet = new HashSet<>();
        for (String s : strings) {
            hashSet.add(s);
        }
        return hashSet;
    }
}
