package ua.javarush.task.jdk13.task06.task0637;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/* 
Прямокутник
У програмі дано двовимірний масив розміром 5*6. Використовуючи тільки метод fill класу Arrays,
заповни масив символами 'X' (велика латинська літера ікс) і ' ' (пробіл) так, як показано у прикладі:
XXXXXX
X    X
X    X
X    X
XXXXXX

Для вирішення цього завдання не можна використовувати цикли.


Requirements:
1. У класі Solution має бути публічне статичне поле array типу char[][], проініціалізоване значенням new char[5][6].
2. Масив array необхідно заповнити відповідно до умови.
3. У програмі потрібно використовувати метод fill класу Arrays.
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        Arrays.fill(array[0], 0, 6, 'X');
        Arrays.fill(array[1], 0, 6, 'X');
        Arrays.fill(array[2], 0, 6, 'X');
        Arrays.fill(array[3], 0, 6, 'X');
        Arrays.fill(array[4], 0, 6, 'X');

        Arrays.fill(array[1], 1, 5, ' ');
        Arrays.fill(array[2], 1, 5, ' ');
        Arrays.fill(array[3], 1, 5, ' ');

//        for (char[] row : array) {
//            for (char ch : row) {
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
