package ua.javarush.task.pro.task04.task0411;

/* 
Парні числа
Напиши програму, де за допомогою циклу for виводяться на екран парні числа від 1 до 15.
Кожне значення потрібно вивести з нового рядка.


Requirements:
1. Програма повинна виводити текст на екран.
2. Програма повинна виводити парні числа від 1 до 15. Кожне значення вивести з нового рядка.
3. У програмі потрібно використовувати цикл for.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}