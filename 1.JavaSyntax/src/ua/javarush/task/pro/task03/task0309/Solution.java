package ua.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Шукаємо максимум
У нас є програма, яка зчитує з клавіатури два числа й виводить на екран більше з них. Якщо числа однакові, то виводиться будь-яке.
Перепиши програму, використовуючи тернарний оператор так, щоб її функціонал залишився без змін.


Requirements:
1. Програма повинна зчитувати два числа з клавіатури.
2. Замість оператора if-else у програмі потрібно використовувати тернарний оператор.
3. Функціонал програми не повинен змінитися.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int maxNumber = (numberA > numberB) ? numberA : numberB;

        System.out.println(maxNumber);

    }
}
