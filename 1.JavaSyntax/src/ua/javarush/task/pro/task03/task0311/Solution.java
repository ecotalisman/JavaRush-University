package ua.javarush.task.pro.task03.task0311;

import java.util.Map;
import java.util.Scanner;

/* 
Висока точність
Напиши програму, яка зчитує з клавіатури два дійсних числа (double) та видає повідомлення щодо того, чи рівні ці
числа з точністю до однієї мільйонної.


Requirements:
1. Програма повинна зчитувати два числа з клавіатури.
2. Якщо числа рівні, то програма повинна вивести повідомлення "числа рівні".
3. Якщо числа не рівні, то програма повинна вивести повідомлення "числа не рівні".
4. Точність порівняння має сягати однієї мільйонної (0,000001).
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (Math.abs(a - b) < 0.000001) {
            System.out.println("числа рівні");
        } else System.out.println("числа не рівні");
    }
}
