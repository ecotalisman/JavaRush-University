package ua.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Аби не в понеділок:)
Проініціалізуй змінну birthDate об'єктом Date із датою свого народження. Реалізуй метод getDayOfWeek(Date date) так,
щоб він повертав українську назву дня тижня з аргументу date.

Requirements:
1. Змінну birthDate слід проініціалізувати під час оголошення.
2. Метод getDayOfWeek(Date date) має повертати українську назву дня тижня.
*/

public class Solution {

    // It was a condition:
//    static Date birthDate = new Date();

    // Change a code:
    static Date birthDate = new Date(125, 5,5);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишіть тут ваш код
        int day = date.getDay();
        switch (day) {
            case 0 -> {
                return  "Неділя";
            }
            case 1 -> {
                return  "Понеділок";
            }
            case 2 -> {
                return "Вівторок";
            }
            case 3 -> {
                return "Середа";
            }
            case 4 -> {
                return "Четвер";
            }
            case 5 -> {
                return "П'ятниця";
            }
            case 6 -> {
                return "Субота";
            }
            default -> {
                return "Не відомий день";
            }
        }
    }
}
