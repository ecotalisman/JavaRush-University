package ua.javarush.task.pro.task05.task0511;

import javax.sound.midi.MidiFileFormat;
import java.util.Random;
import java.util.Scanner;

/* 
Створюємо двовимірний масив
Двовимірний масив — це масив масивів, тобто в кожній його комірці розташоване посилання на якийсь масив. Але значно
простіше уявити його у вигляді таблиці з заданою кількістю рядків (перший вимір) і заданою кількістю стовпців
(другий вимір). У цій задачі ми створюватимемо такий масив.

Для цього реалізуй метод main(String[]), який:

Зчитує з консолі число N — кількість рядків масиву. Число має бути більшим за 0.
Зчитує N чисел із консолі (будь-які числа, більші за 0).
Ініціалізує двовимірний масив multiArray:
кількістю рядків N;
рядки — масивами, розмір яких відповідає числам, уведеним у п. 2 (у порядку введення).
Приклад:

Уведено число 5.
Уведено числа 1, 7, 5, 9, 3.
Отримуємо такий масив:
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]

Requirements:
1. У класі Solution має бути неініціалізована публічна статична змінна multiArray типу int[][].
2. Метод main(String[]) має зчитувати N+1 чисел з клавіатури.
3. У методі main(String[]) ініціалізуй і заповни двовимірний масив згідно з умовою.
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            multiArray = new int[N][];
            for (int i = 0; i < N; i++) {
                int rowSize = scanner.nextInt();
                if (rowSize > 0) {
                    multiArray[i] = new int[rowSize];
                }
            }
        }
//        Random random = new Random();
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                multiArray[i][j] = random.nextInt(100);
//            }
//        }
//
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                System.out.print(multiArray[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
