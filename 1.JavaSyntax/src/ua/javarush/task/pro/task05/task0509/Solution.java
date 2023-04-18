package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
Проініціалізуй масив MULTIPLICATION_TABLE значенням new int[10][10], заповни його таблицею множення й виведи
в консоль у такому вигляді:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в рядках розділено пробілами.


Requirements:
1. У методі main масив MULTIPLICATION_TABLE має бути заповнений таблицею множення.
2. Виведений текст має містити 10 рядків.
3. Кожен виведений рядок має містити 10 чисел, розділених пробілами.
4. Виведені числа мають бути таблицею множення.
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
