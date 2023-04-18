package ua.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/*
Двійковий конвертер
Публічний статичний метод toBinary(int) має перетворювати ціле число, отримане як вхідний параметр, з десяткової
системи числення у двійкову й повертати рядкове подання цього числа. А публічний статичний метод toDecimal(String)
навпаки — має перетворювати рядкове подання двійкового числа на десяткове число.
Методи діють лише для додатних чисел і непорожніх рядків. Якщо вхідний параметр дорівнює або менший за 0, метод
toBinary(int) повертає порожній рядок. Якщо вхідний параметр — порожній рядок або null, метод toDecimal(String) повертає 0.
Твоє завдання — реалізувати ці методи.

Один із алгоритмів перетворення десяткового числа на рядкове подання двійкового числа такий:
while(десяткове число не дорівнює 0) {
двійкове подання = остача від ділення десяткового числа на 2 + двійкове подання
десяткове число = десяткове число / 2
}

Один із алгоритмів перетворення рядкового подання двійкового числа на десяткове число такий:
for (int i = 0; i < довжина двійкового подання; i++) {
десяткове число = десяткове число + число з двійкового подання * на 2 в степені i
}

Спочатку беремо крайнє праве число з двійкового подання. На кожній ітерації циклу беремо наступне число ближче до початку двійкового подання.

Підказка: для піднесення числа до степеня можна скористатися методом Math.pow(число, степінь).
Метод main() у тестуванні не використовується.


Requirements:
1. Потрібно реалізувати метод toBinary(int) згідно з умовою.
2. Потрібно реалізувати метод toDecimal(String) згідно з умовою.
3. Методи Integer.toBinaryString(int) і Long.toBinaryString(int) використовувати не можна.
4. Методи Integer.parseInt(String, int) і Long.parseLong(String, int) використовувати не можна.
5. Методи Integer.toString(int, int) і Long.toString(long, int) використовувати не можна.
6. Об'єкт типу BigInteger використовувати не можна.
7. Об'єкт типу BigDecimal використовувати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber <= 0) {
            return "";
        }

        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            binary.insert(0, decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
        }

        return binary.toString();
    }

    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }

        int decimal = 0;
        int length = binaryNumber.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(binaryNumber.charAt(length - 1 - i));
            decimal += digit * Math.pow(2, i);
        }

        return decimal;
    }
}

/*

binaryNumber.charAt(length - 1 - i): Функція charAt() є методом класу String, який повертає символ (тип char) за
вказаним індексом в рядку. В цьому випадку, ми використовуємо length - 1 - i як індекс, щоб отримати символи рядка
binaryNumber у зворотному порядку, починаючи з крайнього правого символу (молодший біт). Змінна length - це довжина
рядка binaryNumber, а i - ітератор циклу for.

Character.getNumericValue(...): Ця функція належить класу Character і приймає символ char як аргумент. Вона повертає
числове значення (тип int) відповідного символу, якщо символ представляє число. У нашому випадку, вона конвертує
отриманий символ з двійкового числа (0 або 1) в числове значення.

Таким чином, цей рядок коду отримує символ з рядка binaryNumber у зворотному порядку, а потім конвертує цей символ у
відповідне числове значення (0 або 1). Значення зберігається в змінній digit.

розглянемо приклад з двійковим числом "11".

String binaryNumber = "11";
Отже, довжина рядка binaryNumber становить 2. Запустимо цикл for, який працює на протязі довжини рядка:


for (int i = 0; i < binaryNumber.length(); i++) {
    int digit = Character.getNumericValue(binaryNumber.charAt(length - 1 - i));
}
На першій ітерації (i = 0):


binaryNumber.charAt(length - 1 - i) = binaryNumber.charAt(2 - 1 - 0) = binaryNumber.charAt(1);
Це означає, що ми витягуємо символ на індексі 1 (другий символ зліва направо), який дорівнює '1'. Тепер ми конвертуємо
цей символ в числове значення:


int digit = Character.getNumericValue('1');
Значення digit тепер дорівнює 1.

На другій ітерації (i = 1):


binaryNumber.charAt(length - 1 - i) = binaryNumber.charAt(2 - 1 - 1) = binaryNumber.charAt(0);
Тепер ми витягуємо символ на індексі 0 (перший символ зліва направо), який дорівнює '1'. Знову конвертуємо цей символ в
числове значення:


int digit = Character.getNumericValue('1');
Значення digit знову дорівнює 1.

Таким чином, в процесі ітерації ми отримали кожен символ з двійкового числа "11" у зворотному порядку (справа наліво) і
конвертували їх у числові значення 1 та 1.


аналіз двійкового числа "11" насправді дасть десяткове число 3.

Приклад:

1 * 2^1 + 1 * 2^0 = 2 + 1 = 3

Таким чином, двійкове число "11" еквівалентне десятковому числу 3.
*/
