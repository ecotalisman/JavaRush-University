package ua.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Вісімковий конвертер
Публічний статичний метод toOctal(int) має перетворювати ціле число, отримане як вхідний параметр, з десяткової системи
числення у вісімкову. А публічний статичний метод toDecimal(int) навпаки — з вісімкової системи в десяткову.
Методи діють лише для додатних чисел. Якщо вхідний параметр дорівнює або менший за 0, методи повертають 0.
Твоє завдання — реалізувати ці методи.

Один із алгоритмів перетворення десяткового числа на вісімкове такий:
i дорівнює 0
while(десяткове число не дорівнює 0) {
вісімкове число = вісімкове число + (остача від ділення десяткового числа на 8) * на 10 у степені i
десяткове число = десяткове число / 8
i збільшуємо на 1
}

Один із алгоритмів перетворення вісімкового числа на десяткове такий:
i дорівнює 0
while(вісімкове число не дорівнює 0) {
десяткове число = десяткове число + (остача від ділення вісімкового числа на 10) * на 8 у степені i
вісімкове число = вісімкове число / 10
i збільшуємо на 1
}

Метод main() у тестуванні не використовується.

Підказка: для піднесення числа до степеня можна скористатися методом Math.pow(число, степінь).


Requirements:
1. Потрібно реалізувати метод toOctal(int) згідно з умовою.
2. Потрібно реалізувати метод toDecimal(int) згідно з умовою.
3. Методи Integer.toOctalString(int) і Long.toOctalString(int) використовувати не можна.
4. Методи Integer.parseInt(String, int) і Long.parseLong(String, int) використовувати не можна.
5. Методи Integer.toString(int, int) і Long.toString(long, int) використовувати не можна.
6. Об'єкт типу BigInteger використовувати не можна.
7. Об'єкт типу BigDecimal використовувати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        int i = 0;
        int octal = 0;
        while (decimalNumber > 0) {
            octal += (int) (decimalNumber % 8 * Math.pow(10, i));
            decimalNumber /= 8;
            i++;
        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        int i = 0;
        int decimal = 0;
        while (octalNumber > 0) {
            decimal += (int) (octalNumber % 10 * Math.pow(8, i));
            octalNumber /= 10;
            i++;
        }
        return decimal;
    }
}
