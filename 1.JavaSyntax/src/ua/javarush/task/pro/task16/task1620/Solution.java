package ua.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Ще один простий шаблон
У методі main виведи на екран змінну zonedDateTime у такому вигляді: 4 9.3.19 06:03:07.319180500 Europe/Kiev де:
4 — номер дня тижня, тобто четвер; 9 — день місяця; 3 — місяць; 19 — рік; 06 — години; 03 — хвилини; 07 — секунди;
319180500 — наносекунди; Europe/Kiev — часовий пояс.

Requirements:
1. Метод main має вивести в консоль значення змінної zonedDateTime згідно із шаблоном.
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        System.out.println(zonedDateTime.format(dateTimeFormatter));
    }
}


/*

Символи у цьому шаблоні представляють різні елементи дати та часу:

e: Це символ дня тижня. За замовчуванням виводиться від 1 (Понеділок) до 7 (Неділя). Ваше "4" виходить як "Четвер".
d: День місяця, від 1 до 31.
M: Це символ місяця. За замовчуванням виводиться від 1 (Січень) до 12 (Грудень).
yy: Рік у двоцифровому форматі.
HH: Година дня у 24-годинному форматі, від 00 до 23.
mm: Хвилини від 00 до 59.
ss: Секунди від 00 до 59.
n: Наносекунди.
VV: ID часового поясу.
Загалом, цей шаблон формату розподіляє елементи дати та часу на основі символів, вказаних в шаблоні.

*/