package ua.javarush.task.pro.task09.task0917;

/* 
String pool
Метод equal(String, String) порівнює рядки за посиланням за допомогою оператора ==.
Цей метод має повертати true, якщо рядки мають однаковий вміст, і false, якщо їхній вміст різний.
Метод equals() використовувати не можна.


Requirements:
1. У методі equal(String, String) потрібно порівнювати вміст рядків, використовуючи оператор ==.
2. Якщо рядки однакові, метод equal(String, String) має повертати значення true.
3. Якщо рядки різні, метод equal(String, String) має повертати значення false.
4. Метод equals() використовувати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //напишіть тут ваш код
        String strPool1 = first.intern();
        String strPool2 = second.intern();
        if (strPool1 == strPool2) {
            return true;
        } else {
            return false;
        }
    }
}

/*
Цей код містить метод equal(String first, String second), який порівнює два рядки за посиланням за допомогою
оператора ==. Оскільки оператор == порівнює лише посилання, а не вміст рядків, метод intern() використовується для
отримання посилання на рядок у рядковому пулі.

Рядковий пул - це множина рядків, які зберігаються у спеціальному місці пам'яті (heap) у JVM. Метод intern() перевіряє,
чи існує рядок з таким самим вмістом у рядковому пулі. Якщо так, метод повертає посилання на рядок у пулі. Інакше,
рядок додається до рядкового пулу, і метод повертає посилання на цей новий рядок.

Метод equal(String first, String second) працює наступним чином:

Викликає метод intern() для обох вхідних рядків first та second.
Отримує посилання на рядки у рядковому пулі для обох рядків strPool1 та strPool2.
Порівнює посилання на рядки за допомогою оператора ==. Якщо обидва посилання вказують на одну й ту ж рядкову константу
у рядковому пулі, значить, вміст рядків однаковий, і метод повертає true. Інакше, метод повертає false.
*/