package ua.javarush.task.jdk13.task12.task1213;

/* 
Абстрактний клас Pet
Зроби клас Pet абстрактним.

Requirements:
1. Програма не повинна виводити текст на екран.
2. Клас Pet має бути статичним.
3. Клас Pet має бути абстрактним.
4. Клас Pet повинен мати один метод getName().
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - кошеня";
        }
    }
}
