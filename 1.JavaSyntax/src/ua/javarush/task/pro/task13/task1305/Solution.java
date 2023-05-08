package ua.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Знайти і знешкодити
У класі Solution оголошено методи, які слід реалізувати таким чином:

removeBugWithFor(ArrayList<String>) — має видалити зі списку рядок, який містить слово bug, за допомогою циклу for і лічильника.
removeBugWithWhile(ArrayList<String>) — має видалити зі списку рядок, який містить слово bug, за допомогою циклу while і методу iterator().
removeBugWithCopy(ArrayList<String>) — має видалити зі списку рядок, який містить слово bug, за допомогою циклу for-each і копії списку.
Під час пошуку слова bug регістр не враховується.
Метод main реалізовано для вашого коду, і він у перевірці не використовується.

Requirements:
1. Клас Solution має містити публічний статичний метод removeBugWithFor(ArrayList<String>), який не повертає жодного значення (тип void).
2. Клас Solution має містити публічний статичний метод removeBugWithWhile(ArrayList<String>), який не повертає жодного значення (тип void).
3. Клас Solution має містити публічний статичний метод removeBugWithCopy(ArrayList<String>), який не повертає жодного значення (тип void).
4. Метод removeBugWithFor(ArrayList<String>) має працювати згідно з умовою.
5. Метод removeBugWithWhile(ArrayList<String>) має працювати згідно з умовою.
6. Метод removeBugWithCopy(ArrayList<String>) має працювати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишіть тут ваш код
        for (int i = 0; i < list.size(); i++) {
            if ("bug".equalsIgnoreCase(list.get(i))) {
                list.remove(i);
                i--; // Зменшити лічильник, щоб врахувати видалений елемент
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишіть тут ваш код
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("bug".equalsIgnoreCase(iterator.next())) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишіть тут ваш код
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String s : listCopy) {
            if ("bug".equalsIgnoreCase(s)) {
                list.remove(s);
            }
        }
    }
}
