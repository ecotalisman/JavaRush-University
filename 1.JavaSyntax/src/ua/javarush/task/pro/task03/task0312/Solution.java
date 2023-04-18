package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Порівняймо рядки
Напиши програму, яка зчитує з клавіатури два рядки й видає повідомлення щодо того, чи однакові ці рядки.


Requirements:
1. Програма повинна зчитувати два рядки з клавіатури.
2. Якщо рядки однакові, то програма повинна вивести повідомлення "рядки однакові".
3. Якщо рядки не однакові, то програма повинна вивести повідомлення "рядки різні".
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("рядки однакові");
        } else System.out.println("рядки різні");
    }
}
