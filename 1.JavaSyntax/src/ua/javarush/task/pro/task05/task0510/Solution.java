package ua.javarush.task.pro.task05.task0510;

/* 
Трикутний масив
Створи трикутний масив, де значення кожного елемента — це сума його індексів. Наприклад:
array[7][3] = 7 + 3 = 10,
array[3][0] = 3 + 0 = 3.

Виведи масив на екран у такому вигляді:
0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10
...
Числа в рядках розділені пробілами.

Створити трикутний масив можна в такий спосіб:
int[][] array = new int[10][];
array[0] = new int[1];
array[1] = new int[2];
array[2] = new int[3];
...


Requirements:
1. У методі main(String[]) двовимірний масив result заповни числами згідно з умовою.
2. Виведений текст має містити 10 рядків.
3. Виведені числа мають відповідати умові.
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
