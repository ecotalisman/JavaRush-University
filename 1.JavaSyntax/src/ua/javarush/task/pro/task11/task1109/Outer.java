package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
У класі Outer є внутрішній (Inner) клас і вкладений (Nested) клас. Створи в методі main класу Solution
по одному об'єкту кожного з них.


Requirements:
1. У методі main класу Solution потрібно створити об'єкт класу Inner.
2. У методі main класу Solution потрібно створити об'єкт класу Nested.
3. Клас Outer змінювати не можна.
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Створення об'єкта внутрішнього класу");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Створення об'єкта вкладеного класу");
        }
    }
}
