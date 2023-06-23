package ua.javarush.task.pro.task16.task1606;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Вихід із зацикленості
Цикл while мав завершитися за 31 ітерацію, але чомусь програма зациклилася. Знайди та виправ помилку.

Requirements:
1. Виправ одну помилку, щоб програма успішно завершилася.
*/

public class Solution {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            // It was a codition:
//            start.roll(Calendar.DATE, 1);

            // Change a code:
            start.add(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("Фініш");
    }
}
