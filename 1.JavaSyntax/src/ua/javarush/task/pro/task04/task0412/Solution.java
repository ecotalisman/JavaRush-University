package ua.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сума кратних чисел
У методі main з клавіатури зчитується 3 цілих числа: start, end (start <= end), multiple.
Допиши програму, щоб на екран виводилася сума чисел від start (включно) до end (не включно), кратних multiple.
Використай для цього цикл for.
Підказка: щоб перейти до наступної ітерації циклу, використовуй оператор continue.


Requirements:
1. Програма має вивести в консоль суму чисел від start (включно) до end (не включно), кратних multiple.
2. У програмі потрібно використовувати цикл for.
3. У циклі потрібно використовувати оператор continue.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //напишіть тут ваш код
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
                continue;
            }
        }
        System.out.println(sum);
    }
}