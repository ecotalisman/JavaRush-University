package ua.javarush.task.jdk13.task15.task1511;

/* 
Статики і котики
У цьому завданні тобі потрібно:

Створити клас Cat з публічним полем name типу String у класі Solution.
У статичному блоці потрібно створити об'єкт типу Cat та присвоїти його змінній cat (не забудь ініціалізувати поле name).
У статичному блоці потрібно вивести ім'я створеного кота на екран.
Примітка: не створюй конструктори з параметрами в класі Cat.

Requirements:
1. Клас Cat потрібно створити всередині класу Solution, і він має бути публічним і статичним.
2. У класі Cat має бути публічне поле name типу String.
3. Змінну cat потрібно ініціалізувати в статичному блоці класу Solution.
4. У статичному блоці на екран має виводитися ім'я створеного кота.
5. Клас Cat не повинен містити конструктори з параметрами.
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Meow";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
    }

    public static class Cat {
        public String name;
    }
}
