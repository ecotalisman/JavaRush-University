package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показуємо, що отримуємо
Вводимо дані з клавіатури й одразу виводимо їх на екран, доки не буде введено слово "enough".
Слово "enough" виводити не потрібно.
Для цього потрібно використовувати нескінченний цикл (while(true)).

Підказка: щоб завершити нескінченний цикл, використай оператор break.


Requirements:
1. Програма повинна зчитувати дані з клавіатури.
2. У програмі потрібно використовувати цикл while.
3. Для завершення нескінченного циклу слід використати оператор break.
4. Програма повинна виводити на консоль усі введені дані з нового рядка, доки не буде введено слово "enough".
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();
            String enough = "enough";
            if (word.equals(enough)) {
                break;
            }
            System.out.println(word);
        }
    }
}