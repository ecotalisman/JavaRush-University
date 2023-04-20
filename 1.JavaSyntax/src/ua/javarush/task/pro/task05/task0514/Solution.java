package ua.javarush.task.pro.task05.task0514;

import java.util.Arrays;

/* 
Виводимо двовимірні масиви
Реалізуй метод main(String[]), який виводить масиви strings і ints у консоль за допомогою методу Arrays.deepToString(Object[][]).

Requirements:
1. У класі Solution має бути публічна статична змінна strings типу String[][].
2. У класі Solution має бути публічна статична змінна ints типу int[][].
3. У методі main(String[]) виведи в консоль массив strings за допомогою методу Arrays.deepToString(Object[][]).
4. У методі main(String[]) виведи в консоль массив ints за допомогою методу Arrays.deepToString(Object[][]).
*/

public class Solution {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //напишіть тут ваш код
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
