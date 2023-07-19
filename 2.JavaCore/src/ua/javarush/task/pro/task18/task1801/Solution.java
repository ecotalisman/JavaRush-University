package ua.javarush.task.pro.task18.task1801;

import java.util.ArrayList;
import java.util.List;

/* 
Дві реалізації одного інтерфейсу
В інтерфейсі Runnable оголошено метод run() та є дві його реалізації: у класі Car і в класі Plane.
У класі Solution є публічне статичне поле ArrayList<Runnable> list, а також два публічні статичні методи:
addToList(Runnable), який додає у список list елемент, отриманий як вхідний параметр, і метод runList(), який викликає
метод run() для кожного елемента списку list.
Твоє завдання — реалізувати ці методи.

Метод main() у перевірці не використовується.

Requirements:
1. У публічному статичному методі void addToList(Runnable) потрібно додавати у список list елемент, отриманий як вхідний параметр.
2. У публічному статичному методі void runList() слід викликати метод run() для кожного елемента списку list.
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        //напишіть тут ваш код
        list.add(runnable);
    }

    public static void runList() {
        //напишіть тут ваш код
        for (Runnable runnable : list) {
            runnable.run();
        }
    }
}