package ua.javarush.task.jdk13.task06.task0633;

/* 
Вирізаємо середину
Даний двовимірний масив chars. Тобі потрібно у методі main замінити всі внутрішні елементи на дефіс (мінус).

Для виведення вмісту масиву на екран використовуй приватний метод printArray().

Приклад масиву:
a b c d e f
g h i j k l
m n o p q r
s t u v w x

Після відпрацювання програми масив має містити:
a b c d e f
g - - - - l
m - - - - r
s t u v w x


Requirements:
1. У методі main необхідно замінити всі внутрішні елементи масиву chars на дефіс (див. приклад в умові).
*/

public class Solution {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        //напишіть тут ваш код
        for (int i = 1; i < chars.length - 1; i++) {
            for (int j = 1; j < chars[i].length - 1; j++) {
                chars[i][j] = '-';
            }
        }

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
