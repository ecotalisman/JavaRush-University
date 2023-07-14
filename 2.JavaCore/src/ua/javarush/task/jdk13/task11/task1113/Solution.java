package ua.javarush.task.jdk13.task11.task1113;

/* 
Перевстановлення вінди
Реалізуй класи OperatingSystem і Laptop.

До OperatingSystem потрібно:

додати приватні поля name та version типу String, причому name має бути незмінним, а version — таким, що змінюється;
реалізувати конструктор з двомя параметрами типу String, що встановлює значення для полів;
додати геттери та сеттери для полів (сеттери — там, де це можливо).

До Laptop потрібно:

додати приватні незмінні поля String name та OperatingSystem os;
реалізувати конструктор з трьома параметрами типу String, що встановлює значення для полів;
додати геттер для поля name;
додати метод public void updateOS(String version) який має оновлювати версію операційної системи;
додати метод public void printInfo() який має виводити в консолі ім'я ноутбука, ім'я та версію операційної системи
у довільному форматі.

Requirements:
1. Мають бути створені поля name та version у класі OperatingSystem і поля name та os у класі Laptop.
2. У класах OperatingSystem і Laptop мають бути реалізовані конструктори згідно з умовою задачі.
3. У класах OperatingSystem і Laptop мають бути додані геттери і сеттери згідно з умовою задачі.
4. У класі Laptop має бути реалізований метод updateOS згідно з умовою задачі.
5. У класі Laptop має бути реалізований метод printInfo згідно з умовою задачі.
*/

public class Solution {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", "Windows", "3.1");
        Laptop laptop2 = new Laptop("Lenovo", "Linux Ubuntu", "16.4");
        Laptop laptop3 = new Laptop("Apple", "MacOS Monterey", "12.1");
        Laptop laptop4 = new Laptop("Google", "Chrome OS", "1.0");

        laptop1.updateOS("95");
        laptop1.printInfo();
    }
}
