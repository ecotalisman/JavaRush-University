package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
Напишемо програму, в якій потрібно вводити з клавіатури цілі числа й рахувати їх суму, доки користувач не введе слово "ENTER".
Вивести на екран отриману суму й завершити програму.


Requirements:
1. Програма повинна зчитувати дані з клавіатури.
2. Потрібно обчислити суму введених цілих чисел і вивести її на екран, коли користувач введе стоп слово.
3. У програмі потрібно використовувати цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("ENTER")) {
                System.out.println(sum);
                break;
            } else {
                int number = Integer.parseInt(word);
                sum += number;
            }
        }
    }
}