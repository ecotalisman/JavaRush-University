package ua.javarush.task.pro.task03.task0313;

/*
Порівняння рядків за посиланням
У методі main напиши код попарного порівняння за посиланням рядків string1, string2 і string3 з виведенням відповідного
повідомлення після кожного порівняння:
«посилання на рядки однакові» або «посилання на рядки різні».

Порядок порівняння має бути таким:
- рядок string1 з рядком string2
- рядок string2 з рядком string3
- рядок string1 з рядком string3.

Requirements:
1. Поля string1, string2 і string3 та їх значення змінювати не можна.
2. У методі main має бути порівняння рядків string1 і string2 за посиланням.
3. У методі main має бути порівняння рядків string2 і string3 за посиланням.
4. У методі main має бути порівняння рядків string1 і string3 за посиланням.
5. Програма повинна виводити відповідні повідомлення на екран.
6. Програма повинна виводити на екран 3 рядки.
*/

public class Solution {
    public static String string1 = "Аміго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "посилання на рядки однакові";
        String different = "посилання на рядки різні";
        //напишіть тут ваш код
        System.out.println(string1 == string2 ? same : different);
        System.out.println(string2 == string3 ? same : different);
        System.out.println(string1 == string3 ? same : different);
    }
}
