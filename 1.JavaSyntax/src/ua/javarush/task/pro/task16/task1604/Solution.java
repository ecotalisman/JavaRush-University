package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
Проініціалізуй змінну birthDate об'єктом GregorianCalendar з датою свого народження. Реалізуй метод
getDayOfWeek(Calendar calendar) так, щоб він повертав українську назву дня тижня з аргументу calendar. Пам'ятай,
що у григоріанському календарі тиждень починається з неділі.

Requirements:
1. Змінну birthDate слід проініціалізувати під час оголошення.
2. Метод getDayOfWeek(Calendar calendar) має повертати день тижня з аргументу calendar.
*/

public class Solution {

    // It was a condition:
//    static Calendar birthDate = new GregorianCalendar();

    // Change a code:
    static Calendar birthDate = new GregorianCalendar(1984, 4,5);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case 1 -> {
                return  "Неділя";
            }
            case 2 -> {
                return  "Понеділок";
            }
            case 3 -> {
                return "Вівторок";
            }
            case 4 -> {
                return "Середа";
            }
            case 5 -> {
                return "Четвер";
            }
            case 6 -> {
                return "П'ятниця";
            }
            case 7 -> {
                return "Субота";
            }
            default -> {
                return "Не відомий день";
            }
        }
    }
}
