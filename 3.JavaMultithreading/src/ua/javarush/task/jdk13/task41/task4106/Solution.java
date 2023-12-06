package ua.javarush.task.jdk13.task41.task4106;

/* 
Всесвіт під ключ

З класу Universe зроби найпростішого ("наївного") одинака:

додай до класу приватне статичне поле типу Universe;
оголоси статичний метод створення getInstance;
додай "ліниву ініціалізацію" у getInstance;
зроби конструктор класу приватним;
у клієнтському коді заміни виклики конструктора викликами створюючого методу.

Requirements:
1. У класі Universe має бути приватне статичне поле типу Universe.
2. У класі Universe має бути метод public static Universe getInstance().
3. Метод getInstance повинен створювати об'єкт Universe при першому зверненні та повертати його.
4. Конструктор класу Universe має бути приватним.
*/

public class Solution {

    public static void main(String[] args) {
        // It was a condition:
//        Universe universe = new Universe();
//        Universe anotherUniverse = new Universe();

        // Change code here to Singleton
        Universe universe = Universe.getInstance();
        Universe anotherUniverse = Universe.getInstance();
        System.out.println(universe);
        System.out.println(anotherUniverse);
    }
}
