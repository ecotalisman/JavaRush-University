package ua.javarush.task.jdk13.task15.task1504;

/* 
Усе зайве - геть!
Прибери в методі main() зайві рядки, для яких метод add() не реалізовано.

Requirements:
1. У класі Solution потрібно реалізувати три методи add().
2. У методі main() потрібно прибрати зайві рядки.
3. Усі методи класу Solution повинні бути статичними.
4. Усі методи класу Solution повинні бути публічними.
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
//        add("1", 2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}
