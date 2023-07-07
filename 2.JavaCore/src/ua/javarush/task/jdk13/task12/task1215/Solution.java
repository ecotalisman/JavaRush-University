package ua.javarush.task.jdk13.task12.task1215;

/* 
Корова — теж тварина
Успадкуй клас Cow від Animal.
Реалізуй усі методи, яких бракує, у класі Cow.

Requirements:
1. Клас Animal має бути абстрактним.
2. Клас Cow не має бути абстрактним.
3. Клас Cow має успадкуватися від класу Animal.
4. Клас Cow має реалізувати абстрактний метод з класу Animal.
5. Метод getName() класу Cow має повертати будь-яке ім'я корови.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{
        @Override
        public String getName() {
            return "Cow";
        }
    }
}
