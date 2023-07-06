package ua.javarush.task.jdk13.task11.task1104;

/* 
Наш кіт занадто публічний!
Приховай внутрішні змінні класу Cat, до яких є доступ за допомогою методів.

Requirements:
1. Змінна name класу Cat має бути прихована.
2. Змінна age класу Cat має бути прихована.
3. Змінна weight класу Cat має бути відкрита.
4. У класі Cat мають бути 3 змінні.
5. У Cat мають бути і private, і public змінні.
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
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}