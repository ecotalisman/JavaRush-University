package ua.javarush.task.jdk13.task11.task1105;

/* 
Неприступний кіт
Приховай усі внутрішні змінні класу Cat, а також методи, які дозволяють змінювати внутрішній стан об'є'ктів класу Cat.

Requirements:
1. Змінна name класу Cat має бути прихована.
2. Змінна age класу Cat має бути прихована.
3. Змінна weight класу Cat має бути прихована.
4. У Cat мають бути private та public методи.
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

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // It was a condition:
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setAge(int age) {

//            this.age = age;
//        }

        // Write code here:

        private void setName(String name) {
            this.name = name;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}
