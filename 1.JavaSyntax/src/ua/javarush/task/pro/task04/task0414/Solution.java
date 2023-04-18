package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошого забагато не буває
Умови задачі:

Увести з клавіатури рядок і число number, яке більше за 0 і менше за 5.
Вивести рядок на екран number разів, використовуючи цикл do-while. Кожне значення потрібно вивести з нового рядка.
Якщо число number менше за/дорівнює 0 або більше за/дорівнює 5, введений рядок потрібно вивести на екран один раз.
Приклад уведення:
абв
2

Приклад виведення:
абв
абв


Requirements:
1. Програма повинна зчитувати дані з клавіатури.
2. Програма повинна виводити дані на екран.
3. Програма повинна виводити рядок на екран number разів.
4. Якщо число number менше за/дорівнює 0 або більше за/дорівнює 5, програма повинна виводити рядок на екран один раз.
5. У програмі потрібно використовувати цикл do-while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = scanner.nextInt();

        if (number <= 0 || number >= 5) {
            number = 1;
        }

        int counter = 0;
        do {
            System.out.println(word);
            counter++;
        } while (counter < number);
    }
}