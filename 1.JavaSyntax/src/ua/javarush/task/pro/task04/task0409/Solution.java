package ua.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Мінімум серед уведених чисел
Програма повинна зчитувати з клавіатури цілі числа доти, доки не буде введено щось інше: наприклад, рядок або символ.
Виведи на екран мінімальне число серед уведених. Якщо введено кілька таких чисел, необхідно вивести будь-яке з них.

Приклад уведення:
8
4
9
4
5
e

Приклад виведення:
4

Requirements:
1. Програма повинна зчитувати числа з клавіатури.
2. Програма повинна виводити число на екран.
3. Програма повинна виводити на екран мінімальне число серед уведених цілих чисел.
4. Якщо введено кілька мінімальних чисел, потрібно вивести будь-яке з них.
5. Якщо введено лише нечисловий символ, слід вивести на екран максимальне значення числа типу int.
6. Зчитувати дані з клавіатури потрібно в циклі while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        boolean hasNumber = false;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                hasNumber = true;
                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                break;
            }
        }
        System.out.println(hasNumber ? minNumber : Integer.MAX_VALUE);
    }
}