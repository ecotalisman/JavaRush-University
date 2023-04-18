package ua.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальне з N чисел
У цій задачі тобі потрібно:

Ввести з клавіатури число N.
Зчитати N цілих чисел і заповнити ними масив array.
Знайти максимальне число серед елементів масиву.

Requirements:
1. У методі main(String[]) зчитай з клавіатури число N, потім проініціалізуй масив array розміром N елементів і
заповни його числами, уведеними з клавіатури.
2. У методі main(String[]) виведи в консоль максимальне число серед елементів масиву.
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
