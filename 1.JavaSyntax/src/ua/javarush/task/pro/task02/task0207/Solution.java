package ua.javarush.task.pro.task02.task0207;

/* 
Логотип вирішує все
У змінну tagline потрібно записати рядок "JustDoIt".
Використовуй s1, s2, s3 та конкатенацію рядків.

Requirements:
1. Не змінюй значення змінних s1, s2, s3.
2. Для ініціалізації змінної tagline використовуй s1, s2, s3 та конкатенацію рядків.
3. Програма повинна виводити на екран значення змінної tagline.
*/

public class Solution {

    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2; //напишіть тут ваш код

        System.out.println(tagline);
    }
}
