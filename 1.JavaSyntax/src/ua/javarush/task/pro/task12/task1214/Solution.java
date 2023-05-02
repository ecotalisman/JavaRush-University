package ua.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Бувай, Паскалю
У методі main знайди й видали мову програмування Pascal зі списку programmingLanguages.


Requirements:
1. У методі main має видалятися Pascal зі списку programmingLanguages.
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишіть тут ваш код
        programmingLanguages.remove("Pascal");
    }
}
