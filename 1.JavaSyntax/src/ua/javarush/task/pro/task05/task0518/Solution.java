package ua.javarush.task.pro.task05.task0518;

import java.util.Arrays;

/* 
Сортування масиву
Реалізуй метод main(String[]), який сортує масив array за зростанням.
Для сортування масиву використовуй метод Arrays.sort(int[]).


Requirements:
1. Реалізуй метод main(String[]) згідно з умовою.
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //напишіть тут ваш код
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
