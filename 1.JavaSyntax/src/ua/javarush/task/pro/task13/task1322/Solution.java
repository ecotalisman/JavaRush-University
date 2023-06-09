package ua.javarush.task.pro.task13.task1322;

/*

Типи багатокутників
У класі Solution є метод getShapeNameByCountOfCorners(int), який повертає назву багатокутника залежно від кількості кутів.
Твоє завдання — переписати метод, використовуючи тільки оператор switch.

Requirements:
1. Результат роботи методу getShapeNameByCountOfCorners(int) має залишитися незміннім.
2. У методі getShapeNameByCountOfCorners має використовуватися тільки оператор switch.

*/
public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {

        // It was a condition:
//        String shape;
//        if (countOfCorner == 3) {
//            shape = "Трикутник";
//        } else if (countOfCorner == 4) {
//            shape = "Чотирикутник";
//        } else if (countOfCorner == 5) {
//            shape = "П'ятикутник";
//        } else if (countOfCorner == 6) {
//            shape = "Шестикутник";
//        } else if (countOfCorner == 7) {
//            shape = "Семикутник";
//        } else if (countOfCorner == 8) {
//            shape = "Восьмикутник";
//        } else {
//            shape = "Інша фігура";
//        }
//        return shape;

        // Write code here:
        return switch (countOfCorner) {
            case 3 -> "Трикутник";
            case 4 -> "Чотирикутник";
            case 5 -> "П'ятикутник";
            case 6 -> "Шестикутник";
            case 7 -> "Семикутник";
            case 8 -> "Восьмикутник";
            default -> "Інша фігура";
        };
    }
}
