package ua.javarush.task.pro.task12.task1222;

import java.util.ArrayList;

/* 
Виводимо в консоль різні типи
У класі Solution є метод printAnything(ArrayList), який має отримувати список і виводити його вміст у консоль.
Наразі метод отримує на вході тільки список рядків. Твоє завдання — виправити метод так, щоб він отримував на вході
список із будь-якими типами даних (для цього потрібно видалити відповідне узагальнення).
Метод main у перевірці не використовується.


Requirements:
1. Виправ сигнатуру методу printAnything так, щоб він отримував список із будь-якими типами даних.
*/

public class Solution {

    // It was a condition:
//    public static void printAnything(ArrayList<String> arrayList) {
    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
