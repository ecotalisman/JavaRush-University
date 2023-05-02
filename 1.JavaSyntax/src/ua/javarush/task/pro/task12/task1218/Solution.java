package ua.javarush.task.pro.task12.task1218;

import java.io.File;
import java.util.*;

/* 
Shine bright like a diamond
У методі main створюються об'єкти різних типів. У деяких випадках тип елементів об'єкта можна випустити і просто
використовувати оператор diamond(<>).
Заміни тип елементів об'єкта на оператор diamond там, де це можливо, не змінюючи ліву частину виразів.
Порядок розташування змінних не повинен змінюватися.


Requirements:
1. Заміни тип елементів об'єкта на оператор diamond там, де це можливо.
2. Ліву частину виразів змінювати не можна.
*/

public class Solution {

    public static void main(String[] args) {

        // It was a condition:
//        ArrayList<String> stringArrayList = new ArrayList<String>();
//        Stack<String> stack = new Stack<String>();
//        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
//        var exceptionsList = new ArrayList<Exception>();
//        var filesStack = new Stack<File>();

        ArrayList<String> stringArrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
