package ua.javarush.task.jdk13.task14.task1409;

import java.time.DayOfWeek;

/* 
Ускладнюємо switch expression
Метод main за допомогою метода getLettersCount отримує інформацію про кількість літер у назвах днів тижнів, і виводить її у вигляді:

MONDAY: (6)
TUESDAY: (7)
...
Внеси зміни до getLettersCount (додай виведення на екран), щоб інформация виводилася у вигляді:

MONDAY: шість(6)
TUESDAY: сім(7)
...
Метод getLettersCount повинен як і раніше містити одну команду return та використовувати switch expression.

Requirements:
1. Не можна змінювати метод main.
2. Виведення в консолі має змінитися відповідно до умови.
3. У методі getLettersCount має бути лише return з switch expression.
*/

public class Solution {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day + ": ");
            System.out.println("(" + getLettersCount(day) + ")");
        }
    }

    public static int getLettersCount(DayOfWeek day) {
        // It was a condition:
//        return switch (day) {
//            case MONDAY, FRIDAY, SUNDAY -> 6;
//            case TUESDAY -> 7;
//            case THURSDAY, SATURDAY -> 8;
//            case WEDNESDAY -> 9;
//        };

        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.print("шість");
                yield 6;
            }
            case TUESDAY -> {
                System.out.print("сім");
                yield 7;
            }
            case THURSDAY, SATURDAY -> {
                System.out.print("вісім");
                yield 8;
            }
            case WEDNESDAY -> {
                System.out.print("дев'ять");
                yield 9;
            }
        };
    }
}
