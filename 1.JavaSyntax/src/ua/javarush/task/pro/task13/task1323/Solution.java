package ua.javarush.task.pro.task13.task1323;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перетворення списку на множину
У цьому завданні потрібно отримати кількість унікальних слів у списку. Одним із способів рішення є перетворення списку
на множину. Як відомо, у множині всі елементи унікальні та розмір отриманої множини саме і буде кількістю унікальних слів.

Реалізуй метод listToSet(ArrayList<String>), який перетворює список рядків у множину.


Requirements:
1. Сигнатуру і тип значення, що повертається, методу listToSet(ArrayList<String>) не змінюй.
2. Метод listToSet повинен перетворювати отриманий список рядків (ArrayList<String>) у множину (HashSet<String>).
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(asList(
                "Світ побачила нова серія книг по програмуванню на Java: \"Java для початківців\", \"Java для тих, хто продовжує\", \"Java для тих, хто закінчує\""
                        .split(" ")));
        System.out.println("Кількість слів у списку: " + listOfWords.size());
        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Кількість слів у множині: " + setOfWords.size());
    }

    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
        HashSet<String> result = new HashSet<>();
        //напишіть тут ваш код
        for (String s : listOfWords) {
            result.add(s);
        }


        return result;
    }
}