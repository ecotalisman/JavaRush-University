package ua.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезуємо LocalDateTime
У методі convert потрібно перетворити Map на Set. Принцип перетворення: якщо в sourceMap було два таких елементи:
2018-05-31=[12:43:00.615424667, 08:35:29.212766273] 1998-01-31=[07:56:59.931458499], то в результаті множина має
містити три елементи: 2018-05-31T12:43:00.615424667 2018-05-31T08:35:29.212766273 1998-01-31T07:56:59.931458499

Requirements:
1. Метод convert має перетворити Map на Set згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишіть тут ваш код
        Set<LocalDateTime> resultSet = new HashSet<>();

        for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
            LocalDate date = entry.getKey();
            List<LocalTime> times = entry.getValue();

            for (LocalTime time : times) {
                resultSet.add(LocalDateTime.of(date, time));
            }
        }

        return resultSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}