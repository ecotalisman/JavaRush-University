package ua.javarush.task.pro.task03.task0303;

import java.util.Scanner;

/* 
Школа чи інститут
Є програма, яка отримує на вході вік і визначає, чекають учня в школі чи вже час до інституту. Але вона працює
неправильно. Наприклад, п'ятирічну дитину відправляють до інституту! Виправити програму нескладно: досить у потрібному
місці поставити фігурні дужки.


Requirements:
1. Програма повинна зчитувати число з клавіатури.
2. Програма повинна використовувати команду System.out.println() або System.out.print().
3. Якщо вік менший за 18 і більший або дорівнює 6, потрібно вивести тільки повідомлення "треба ходити до школи".
4. Якщо вік більше або дорівнює 18, потрібно вивести тільки повідомлення "час до інституту".
5. Якщо вік менший за 6, то нічого виводити не потрібно.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("треба ходити до школи");
        }
        else
            System.out.println("час до інституту");
    }
}
