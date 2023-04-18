package ua.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;

/* 
Оце так переворот!
У класі Solution дано двовимірний масив цілих чисел (поле array) розмірністю 3х3. Необхідно:

порядково заповнити цей масив числами з клавіатури;
перевернути масив щодо головної діагоналі (у головній діагоналі є властивість i == j);
вивести перевернутий масив на екран у такому вигляді, як у прикладі — кожен рядок окремо, елементи у рядку через пробіл.
Приклад перевороту масиву.
Вихідний масив:
1 2 3
4 5 6
7 8 9
Масив, перевернутий відносно головної діагоналі:
1 4 7
2 5 8
3 6 9


Requirements:
1. У програмі потрібно зчитувати 9 чисел із клавіатури.
2. Масив array необхідно перевернути відносно головної діагоналі.
3. У програмі необхідно вивести елементи масиву відповідно до умови.
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                if (i != j) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }

        for (int[] ints : array) {
            String delimeter = "";
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(delimeter + ints[j]);
                delimeter = " ";
            }
            System.out.println();
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (j != 0) {
//                    System.out.print(" ");
//                }
//                System.out.print(array[j][i]);
//            }
//            System.out.println();
//        }
    }
}
