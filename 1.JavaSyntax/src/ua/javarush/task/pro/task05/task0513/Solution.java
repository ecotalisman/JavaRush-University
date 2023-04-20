package ua.javarush.task.pro.task05.task0513;

import java.util.Arrays;

/* 
Виводимо масиви
Реалізуй метод main(String[]), який виводить масиви strings і ints у консоль за допомогою методу Arrays.toString().

Requirements:
1. У класі Solution має бути публічна статична змінна strings типу String[].
2. У класі Solution має бути публічна статична змінна ints типу int[].
3. У методі main(String[]) виведи в консоль масив strings за допомогою методу Arrays.toString(Object[]).
4. У методі main(String[]) виведи в консоль масив ints за допомогою методу Arrays.toString(int[]).
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //напишіть тут ваш код
        String str1 = Arrays.toString(strings);
        System.out.println(str1);
        String str2 = Arrays.toString(ints);
        System.out.println(str2);
    }
}
