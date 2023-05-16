package ua.javarush.task.pro.task13.task1321;

/*
Зі switch на if
У класі Solution є метод getTranslationForDayOfWeek(String), який повертає переклад назви дня тижня з української на
англійську. Твоє завдання — переписати метод, використовуючи тільки оператор if-else.

Requirements:
1. Метод getTranslationForDayOfWeek(String) має повертати переклад назви дня тижня з української на англійську.
2. У методі getTranslationForDayOfWeek(String) має використовуватися тільки оператор if-else.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вівторок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {

        // Write a code here:
        String en;
        if (ua.toLowerCase().equals("понеділок")) {
            en = "Monday";
        } else if (ua.toLowerCase().equals("вівторок")) {
            en = "Tuesday";
        } else if (ua.toLowerCase().equals("середа")) {
            en = "Wednesday";
        } else if (ua.toLowerCase().equals("четвер")) {
            en = "Thursday";
        } else if (ua.toLowerCase().equals("п'ятниця")) {
            en = "Friday";
        } else if (ua.toLowerCase().equals("субота")) {
            en = "Saturday";
        } else if (ua.toLowerCase().equals("неділя")) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;

        // It was a condition:

//        String en;
//        switch (ua.toLowerCase()) {
//            case "понеділок":
//                en = "Monday";
//                break;
//            case "вівторок":
//                en = "Tuesday";
//                break;
//            case "середа":
//                en = "Wednesday";
//                break;
//            case "четвер":
//                en = "Thursday";
//                break;
//            case "п'ятниця":
//                en = "Friday";
//                break;
//            case "субота":
//                en = "Saturday";
//                break;
//            case "неділя":
//                en = "Sunday";
//                break;
//            default:
//                en = "Неприпустимий день тижня";
//        }
//        return en;

    }
}
