package ua.javarush.task.pro.task16.task1618;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* 
Аби не заплутатися
Чи можна, знаючи час в одному часовому поясі, визначити час в іншому? Розв'яжи цю задачу в методі changeZone.
Його параметри: fromTime — відомий час; fromZone — часовий пояс, для якого відомо час; toZone — часовий пояс, для якого
потрібно визначити час.

Requirements:
1. Метод changeZone має повернути LocalDateTime у часовому поясі toZone.
*/

public class Solution {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //напишіть тут ваш код
        ZonedDateTime start = ZonedDateTime.of(fromDateTime, fromZone);
        return start.withZoneSameInstant(toZone).toLocalDateTime();
    }
}
