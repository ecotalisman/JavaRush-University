package ua.javarush.task.jdk13.task16.task1618;

/* 
Справедливість
1. Розберися з тим, що робить програма.
2. Потрібно зробити так, щоб усі миші їли одночасно.
3. Подумай, який метод дозволяє альфа-самцю миші їсти першим, і чому решта мишей чекає.
4. Видали виклик цього методу.

Requirements:
1. Виведення програми маэ показувати, що спочатку всі миші почали їсти, а потім усі закінчили.
2. Метод join не повинен викликатися в об'єктів типу Mouse.
3. Програма повинна створювати 3 об'єкти типу Mouse.
4. Методи, які відповідальні за виведення в консолі, не змінюй.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");

//        alpha.join();

        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignore) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}
