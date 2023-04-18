package ua.javarush.task.pro.task04.task0404;

/* 
Заповнений прямокутник
Використовуючи вкладені цикли while (цикл у циклі), виведи на екран прямокутник розміром 5 (висота) на 10 (ширина),
заповнений літерами «Q».

Приклад виведення:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ


Requirements:
1. Програма повинна виводити текст на екран.
2. Програма повинна виводити прямокутник висотою 5 і шириною 10, заповнений літерами 'Q'.
3. У програмі потрібно використовувати вкладені цикли while (цикл у циклі).
4. Виведення на екран повинно відбуватися в циклі while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int height = 5;
        int width = 10;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}