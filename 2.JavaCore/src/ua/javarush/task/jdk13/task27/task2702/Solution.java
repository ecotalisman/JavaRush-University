package ua.javarush.task.jdk13.task27.task2702;

/* 
Модифікатори та deadlock
Розстав модифікатори таким чином, щоб при роботі з цим кодом з'явився deadlock.
Метод main породжує deadlock, тому не бере участі в тестуванні.

Requirements:
1. Поле field має бути приватним.
2. Метод getField НЕ повинен бути приватним.
3. Метод sout потрібно оголосити з модифікатором synchronized.
4. Метод sout2 потрібно оголосити з модифікатором synchronized.
*/

public class Solution {
    private final String field;

    public Solution(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public synchronized void sout(Solution solution) {
        System.out.format("111:  %s: %s %n", this.field, solution.getField());
        solution.sout2(this);
    }

    public synchronized void sout2(Solution solution) {
        System.out.format("222:  %s: %s %n", this.field, solution.getField());
        solution.sout(this);
    }

    public static void main(String[] args) {
        final Solution solution = new Solution("first");
        final Solution solution2 = new Solution("second");
        new Thread(new Runnable() {
            public void run() {
                solution.sout(solution2);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                solution2.sout(solution);
            }
        }).start();

    }
}
