package ua.javarush.task.jdk13.task11.task1103;

/* 
Прихований інкапсульований кіт
Приховай усі внутрішні змінні класу Cat.

Requirements:
1. Змінна name класу Cat має бути прихована.
2. Змінна age класу Cat має бути прихована.
3. Змінна weight класу Cat має бути прихована.
4. У класі Cat мають бути 3 змінні.
5. Усі змінні класу Cat мають бути private.

*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {

        // It was a condition:
//        public String name;
//        public int age;
//        public int weight;

        // Write code here:
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

