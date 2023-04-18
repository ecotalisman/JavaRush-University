package ua.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Мінімальне з N чисел
Щоб виконати цю задачу, тобі потрібно:

Ввести з клавіатури число N.
Зчитати N цілих чисел і заповнити ними масив.
Знайти й вивести в консоль мінімальне число серед елементів масиву.

Requirements:
1. У методі main(String[]) зчитай з клавіатури число N, потім проініціалізуй масив array розміром N елементів і заповни
його числами, уведеними з клавіатури.
2. У методі main(String[]) виведи в консоль мінімальне число серед елементів масиву.
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
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
