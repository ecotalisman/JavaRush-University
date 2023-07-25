package ua.javarush.task.jdk13.task15.task1507;

/* 
Максимально простий код-3
Спрости код:
прибери всі успадкування класі, які автоматично додадуться при компіляції;
прибери всі конструктори, які створюються та додаються автоматично.

Requirements:
1. У класі Car не повинно бути явно реалізованих конструкторів без параметрів.
2. У класі Machine не повинно бути явно реалізованих конструкторів без параметрів.
3. Клас Car повинен бути нащадком класу Machine.
4. У коді не повинно бути явного успадкування від Object (extends Object).
5. Клас Car не повинен явно наслідудвати інтерфейс Runnable.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {
        // Comments code here:
//        public Machine() {
//            super();
//        }
    }

    public class Car extends Machine {
        // Comments code here:
//        public Car() {
//            super();
//        }
    }
}
