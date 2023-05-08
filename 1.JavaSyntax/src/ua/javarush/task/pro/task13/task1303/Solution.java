package ua.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Виводимо в консоль елементи множини
У класі Solution є метод print(HashSet<String>), який має виводити в консоль усі елементи множини, використовуючи iterator().
Метод main у перевірці не використовується.


Requirements:
1. Клас Solution має містити публічний статичний метод print(HashSet<String>), який не повертає жодного значення (тип void).
2. Метод print(HashSet<String>) має працювати згідно з умовою.
*/

public class Solution {

    public static void print(HashSet<String> words) {
        //напишіть тут ваш код
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}
