package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
Використовуючи вкладені цикли while (цикл у циклі), виведи на екран незаповнений прямокутник (контур) розміром 10 (висота) на 20 (ширина) з літер «Б».
Незаповнена частина складається з пробілів.

Приклад виведення:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ


Requirements:
1. Програма повинна виводити текст на екран.
2. Програма повинна виводити контур прямокутника висотою 10 і шириною 20 із літер 'Б'.
3. У програмі потрібно використовувати вкладені цикли while (цикл у циклі).
4. Виведення на екран повинно відбуватися в циклі while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int height = 10;
        int width = 20;

        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}