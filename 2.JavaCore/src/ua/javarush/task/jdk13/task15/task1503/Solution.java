package ua.javarush.task.jdk13.task15.task1503;

/* 
Чоловік чи жінка?
Зміни метод printName() таким чином, щоб він виконувався для man і woman.
Реалізація методу printName() має бути одна.

Requirements:
1. У класі Solution потрібно реалізувати лише один метод printName().
2. Метод printName() має приймати один параметр типу Human.
3. Клас Man повинен бути нащадком класу Human.
4. Клас Woman повинен бути нащадком класу Human.
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    // It was a condition:
//    public static void printName(Man man) {
//
//    }

    // Write code here:
    public static void printName(Human human) {

    }

    public static class Human {

    }

    // It was a condition:
//    public static class Man {
//
//    }
//
//    public static class Woman {
//
//    }

    // Write code here:
    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
