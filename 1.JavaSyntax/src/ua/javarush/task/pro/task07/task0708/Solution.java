package ua.javarush.task.pro.task07.task0708;

/* 
Правильні типи
Реалізуй метод setValues(long value), який записуватиме отримане значення параметра value в змінні a, b, c і d.
Змінювати типи змінних a, b, c і d не можна.

Requirements:
1. Типи змінних a, b, c і d не повинні змінитися.
2. Метод setValues(long value) має записувати отримане значення в змінні a, b, c і d.
*/

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        //напишіть тут ваш код
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
