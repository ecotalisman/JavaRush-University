package ua.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Шахівниця
Давай створимо програму для генерації квадратних шахових дощок із заданою розмірністю. У класі Solution дано
двовимірний масив символів (поле array). Необхідно:

прочитати число з клавіатури - це буде розмірність нашої майбутньої дошки (довжина сторони);
ініціалізувати масив array відповідним значенням;
"зафарбувати" масив так, щоб вийшла шахівниця (чорні клітини — '#', білі — ' '). Починаємо заповнювати масив
з '#' з верхнього лівого кута;
вивести масив на екран у такому вигляді, як у прикладі (кожний рядок окремо).
Приклад виведення для числа 5:
# # #
 # #
# # #
 # #
# # #


Requirements:
1. У програмі слід зчитувати число з клавіатури.
2. Поле array необхідно проініціалізувати масивом відповідного розміру.
3. Масив array необхідно заповнити відповідно до умови.
4. У програмі необхідно вивести елементи масиву на екран (див. приклад в умові).
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
