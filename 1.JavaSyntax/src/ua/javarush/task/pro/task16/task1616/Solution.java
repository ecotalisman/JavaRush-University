package ua.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренування «Часові зони»
Що спільного у всіх часових зон і Пекіна? Правильно! Вони дадуть нам змогу потренуватися у використанні класів ZoneId
і ZonedDateTime :) Реалізуй два методи: - у методі getSortedZones поверни множину TreeSet усіх часових зон; - у методі
getBeijingTime поверни поточний час у Пекіні (часова зона для нього — "Asia/Shanghai").

Requirements:
1. Метод getSortedZones має повернути множину всіх часових зон.
2. Метод getBeijingDateTime має повернути поточну дату і час у Пекіні.
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишіть тут ваш код
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишіть тут ваш код
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
