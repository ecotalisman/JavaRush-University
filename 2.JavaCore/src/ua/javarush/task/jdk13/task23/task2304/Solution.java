package ua.javarush.task.jdk13.task23.task2304;

/* 
Напруж звивини!
Метод printName повинен виводити ім'я власного об'єкту, тобто "The Darkside Hacker"
Зроби мінімум змін.

Requirements:
1. Виведення на екран має бути відповідним до умови завдання.
2. У класі Solution має бути метод sout без параметрів.
3. У класі Solution має бути поле name.
4. Модифікатор доступу методу getName потрібно розширити.
*/

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    // It was a condition:
//    private String getName() {

    // Change code to `public` getName():
    public String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Ріша").sout();
    }
}
