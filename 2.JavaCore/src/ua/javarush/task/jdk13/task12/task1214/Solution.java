package ua.javarush.task.jdk13.task12.task1214;

/* 
«Виправ код», частина 2
Виправ код, щоб програма компілювалася.

Requirements:
1. Клас Pet має бути статичним.
2. Клас Pet повинен мати два методи.
3. Метод getChild() має бути абстрактним.
4. Клас Pet має бути оголошений із модифікатором, який забороняє створювати конкретні об'єкти цього класу.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - кошеня";
        }

        public abstract Pet getChild();
    }
}
