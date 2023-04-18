package ua.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
Ввести з клавіатури три цілих числа. Визначити, чи є серед них хоча б одна пара рівних між собою чисел.
Якщо така пара існує, вивести на екран числа через пробіл. Якщо всі три числа рівні між собою, то вивести всі три.

Приклади:
a) якщо введено числа 1 2 2, програма виводить 2 2

b) якщо введено числа 2 2 2, програма виводить 2 2 2

Requirements:
1. Програма повинна зчитувати три числа з клавіатури.
2. Програма повинна містити System.out.println() або System.out.print()
3. Якщо два числа рівні між собою, потрібно вивести їх на екран.
4. Якщо всі три числа рівні між собою, потрібно вивести всі три.
5. Якщо немає рівних чисел, не виводити нічого.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3= scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if (number1 == number2) {
            System.out.println(number1 + " " + number2);
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }
    }
}
