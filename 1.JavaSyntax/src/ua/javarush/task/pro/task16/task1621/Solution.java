package ua.javarush.task.pro.task16.task1621;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Напиши шаблон
Ініціалізуй статичну змінну dateTimeFormatter. Подумай, який шаблон для неї задати, щоб можна було розпарсити рядок
timeString. У методі main створи об'єкт LocalDateTime, використовуючи рядок timeString і твій шаблон dateTimeFormatter.

Requirements:
1. Змінну dateTimeFormatter має бути ініціалізовано під час оголошення.
2. Метод main має створити об'єкт LocalDateTime, а для цього розпарсити рядок timeString за допомогою шаблону dateTimeFormatter.
*/

public class Solution {

    // It was a condition:
//    static DateTimeFormatter dateTimeFormatter;

    // Change a code:
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        // It was a condition:
//        LocalDateTime dateTime;
//        System.out.println(dateTime);

        // Change a code:
        LocalDateTime parse = LocalDateTime.parse(timeString, dateTimeFormatter);
        System.out.println(parse);
    }
}
