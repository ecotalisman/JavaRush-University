package ua.javarush.task.jdk13.task27.task2701;

/* 
Створюємо deadlock
Розстав модифікатори таким чином, щоб при роботі з цим кодом з'явився deadlock.
Метод main породжує deadlock, тому не бере участі в тестуванні.

Requirements:
1. Клас Solution.Friend НЕ повинен бути приватним.
2. Клас Solution.Friend повинен бути статичним.
3. Метод bow потрібно оголосити з модифікатором synchronized.
4. Метод bowBack потрібно оголосити з модифікатором synchronized.
*/

public class Solution {
    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }

    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        // It was a condition:
//        public void bow(Friend bower) {

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s"
                              + " bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        // It was a condition:
//        public void bowBack(Friend bower) {

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                              + " bowed back to me!%n",
                    this.name, bower.getName());
        }
    }
}
