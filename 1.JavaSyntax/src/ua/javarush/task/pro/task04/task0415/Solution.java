package ua.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площа круга

Умови задачі:

Увести с клавіатури ціле додатне число radius. Це число будемо використовувати як радіус кола.
Вивести на екран площу круга, обчислену за формулою: S = pi * radius * radius.
Результатом має бути ціле число (тип int). Для цього потрібно перетворити результат множення на число типу int
(відкинути дробову частину, округливши результат до меншого цілого числа).
Для змінної pi використовуй значення 3.14.

Приклад уведення:
5

Приклад виведення:
78


Requirements:
1. Програма повинна зчитувати ціле число з клавіатури.
2. Програма повинна виводити число на екран.
3. Програма повинна виводити на екран площу круга радіусом radius як ціле число.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        int roundedArea = (int) Math.floor(area);
        System.out.println(roundedArea);
    }
}