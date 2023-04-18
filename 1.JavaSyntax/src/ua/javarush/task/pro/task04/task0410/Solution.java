package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Друге мінімальне число серед уведених
Умови задачі:

Потрібно зчитувати з клавіатури цілі числа доти, доки не буде введено щось інше: наприклад, рядок або символ.
Потрібно ввести щонайменше два числа. Якщо введено менше двох цілих чисел, то таку ситуацію обробляти не потрібно,
а програма може завершитися з помилкою.
Вивести на екран друге за величиною ціле число після мінімального серед уведених з клавіатури. Якщо таких чисел
декілька, потрібно вивести будь-яке з них.
Мінімальних чисел теж може бути декілька.
Приклад уведення:
8
4 // мінімальне число
7
4 // мінімальне число
5 // друге за величиною число (друге мінімальне)
9
5 // друге за величиною число (друге мінімальне)
exit
Приклад виведення:
5


Requirements:
1. Програма повинна зчитувати числа з клавіатури.
2. Програма повинна виводити число на екран.
3. Програма повинна виводити на екран друге мінімальне число серед уведених цілих чисел.
4. Якщо введено кілька других мінімальних чисел, потрібно вивести будь-яке з них.
5. Зчитувати дані з клавіатури потрібно в циклі while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int secondMinNumber = Integer.MAX_VALUE;
        boolean hasTwoNumbers = false;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < minNumber) {
                    secondMinNumber = minNumber;
                    minNumber = number;
                } else if (number > minNumber && number < secondMinNumber) {
                    secondMinNumber = number;
                }
                hasTwoNumbers = true;
            } else {
                break;
            }
        }
        System.out.println(hasTwoNumbers ? secondMinNumber : "Not enough numbers");
    }
}