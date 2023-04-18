package ua.javarush.task.jdk13.task06.task0632;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Піраміда
Напишемо програму для малювання піраміди із заданою висотою.
У класі Solution дано двовимірний масив символів (поле array). Необхідно:
зчитати число з клавіатури — це і буде висота піраміди;
ініціалізувати масив array відповідним значенням;
заповнити масив так, щоб вийшла піраміда (клітини, що становлять піраміду, заповнити символами '#', фон - ' ', див. приклад);
вивести масив на екран у такому вигляді, як у прикладі (кожний рядок окремо).
Приклад виведення для числа 5:
    #
   ###
  #####
 #######
#########


Requirements:
1. У програмі потрібно зчитувати число із клавіатури.
2. Поле array необхідно проініціалізувати масивом відповідного розміру.
3. Масив array необхідно заповнити відповідно до умови.
4. У програмі потрібно вивести елементи масиву на екран (див. приклад в умові).
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        // Зчитуємо число із клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(reader.readLine());
        reader.close();

        // Ініціалізуємо масив array відповідного розміру
        array = new char[height][height * 2 - 1];

        // Заповнюємо масив
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2 - 1; j++) {
                if (j >= height - i - 1 && j <= height + i - 1) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        // Виводимо масив на екран
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2 - 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
