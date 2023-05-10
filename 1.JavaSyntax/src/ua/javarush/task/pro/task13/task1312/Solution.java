package ua.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
ArrayList і HashMap
У класі Solution є метод getProgrammingLanguages, який повертає список мов програмування. Потрібно переписати цей метод,
щоб він повертав HashMap<Integer, String>. Ключем у цій колекції буде індекс елемента в ArrayList.


Requirements:
1. Клас Solution має містити публічний статичний метод getProgrammingLanguages, який повертає значення типу HashMap<Integer, String>.
2. Метод getProgrammingLanguages() має повертати значення HashMap, що заповнено відповідно до списку.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {

        // The condition that needed to be changed was:

//    public static ArrayList<String> getProgrammingLanguages() {

//        ArrayList<String> programmingLanguages = new ArrayList<>();
//        programmingLanguages.add("Java");
//        programmingLanguages.add("Kotlin");
//        programmingLanguages.add("Go");
//        programmingLanguages.add("Javascript");
//        programmingLanguages.add("Typescript");
//        programmingLanguages.add("Python");
//        programmingLanguages.add("PHP");
//        programmingLanguages.add("C++");
//        return programmingLanguages;

        //напишіть тут ваш код

        // Solution version 1:
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(0, "Java");
//        map.put(1, "Kotlin");
//        map.put(2, "Go");
//        map.put(3, "Javascript");
//        map.put(4, "Typescript");
//        map.put(5, "Python");
//        map.put(6, "PHP");
//        map.put(7, "C++");


        // Solution version 2:
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            map.put(i, programmingLanguages.get(i));
        }

        return map;
    }
}
