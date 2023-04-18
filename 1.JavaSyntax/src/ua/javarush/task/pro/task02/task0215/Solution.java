package ua.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Читання чисел
Зчитай з клавіатури три цілих числа.
Виведи на екран середнє арифметичне цих чисел.

Приклад уведення:

51
101
201
Приклад виведення:

117
Середнє арифметичне — це число, що дорівнює сумі всіх чисел, поділеній на їх кількість.
Використовуй ділення без остачі.


Requirements:
1. Програма повинна зчитувати з клавіатури три цілих числа.
2. Програма повинна виводити на екран середнє арифметичне зчитаних чисел.
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3) / 3;
        System.out.println((int) average);
    }
}
