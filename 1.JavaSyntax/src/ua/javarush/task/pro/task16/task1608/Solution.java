package ua.javarush.task.pro.task16.task1608;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Просто день тижня
Реалізуй метод getDayOfWeek(LocalDate date) так, щоб він повертав українську назву дня тижня з аргументу date.
Скористайся методами getDayOfWeek і getDisplayName. Приклад параметрів методу getDisplayName для отримання української
назви дня тижня: getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk"))

Requirements:
1. Метод getDayOfWeek(LocalDate date) має повертати день тижня українською.
2. Щоб отримати назву дня тижня, потрібно використовувати методи getDayOfWeek і getDisplayName.
*/

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        //напишіть тут ваш код
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("uk"));
    }
}
