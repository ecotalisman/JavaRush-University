package ua.javarush.task.jdk13.task12.task1216;

/* 
Кішки не повинні бути абстрактними!
Успадкуй класи Cat та Dog від Pet.
Реалізуй методи, яких бракує. Класи Cat та Dog не повинні бути абстрактними.

Requirements:
1. Клас Pet має бути абстрактним.
2. Клас Dog не має бути абстрактним.
3. Клас Cat не має бути абстрактним.
4. Клас Dog повинен успадкуватися від класу Pet і реалізувати його абстрактні методи.
5. Клас Cat повинен успадкуватися від класу Pet і реалізувати його абстрактні методи.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return null;
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

}
