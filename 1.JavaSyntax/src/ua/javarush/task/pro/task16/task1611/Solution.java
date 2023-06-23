package ua.javarush.task.pro.task16.task1611;

import java.time.LocalTime;

/* 
Треба просто порахувати
Цикл while у методі main має відпрацювати точно чотири рази, щоб на екран було виведено 4 рядки. Зміни можна вносити тільки в метод amazingMethod.

Requirements:
1. Метод amazingMethod слід змінити так, щоб після запуску програма вивела 4 рядки.
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        // It was a condition:
//        return base.plusHours(3);

        // Change a code:
        return base.plusMinutes(288);
    }
}
