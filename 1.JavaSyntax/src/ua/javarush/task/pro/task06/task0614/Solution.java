package ua.javarush.task.pro.task06.task0614;

/* 
Згадуємо геометрію
Поглянь, що робить програма. Розстав модифікатор final біля загальноприйнятих констант (змінних з незмінними значеннями).


Requirements:
1. Модифікатор final має бути встановлено для всіх констант.
*/

public class Solution {
    public static final double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Площа круга дорівнює : " + pi * radius * radius);
        System.out.println("Периметр круга дорівнює : " + pi * diameter);
    }
}
