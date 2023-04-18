package ua.javarush.task.pro.task06.task0603;

/* 
Улюблена страва
Перейменуй параметри методу printPersonInfo():

firstName на name;
lastName на surname;
favouriteDish на meal;
у такий спосіб, щоб функціонал програми залишився незмінним.
Імена змінних в методі main() залиш без змін.

Requirements:
1. Параметри методу printPersonInfo() мають називатися name, surname і meal.
2. Результат виведення в консоль має відповідати умові задачі.
3. У методі main() змінні firstName, lastName, favouriteDish мають залишитися без змін.
*/

public class Solution {

    public static void main(String[] args) {
        String firstName = "Даша";
        String lastName = "Євтух";
        String favouriteDish = "Борщ";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Коротке досьє:");
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + surname);
        System.out.println("Улюблена страва: " + meal);
    }
}
