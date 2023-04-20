package ua.javarush.task.pro.task09.task0919;

/* 
Перевертання рядка
Використовуючи StringBuilder в методі reverseString(String), переверни рядок, отриманий як параметр.


Requirements:
1. У методі reverseString(String) потрібно використовувати StringBuilder.
2. Метод reverseString(String) має повертати перевернутий рядок.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Їхав мопед задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //напишіть тут ваш код
        StringBuilder builder = new StringBuilder();
        builder.append(string);
        builder.reverse();
        String str = builder.toString();
        return str;
    }
}
