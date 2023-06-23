package ua.javarush.task.pro.task16.task1617;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* 
Часова глобалізація
У методі main присвой значення змінній globalTime із використанням змінних localDateTime і zoneId.

Requirements:
1. Метод main має присвоїти значення змінній globalTime, використовуючи змінні localDateTime і zoneId.
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        //напишіть тут ваш код
        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
    }
}
