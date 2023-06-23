package ua.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Опанування нового API
У класі Solution реалізуй 4 методи: - метод nowExample має повернути поточну дату; решта методів мають повернути
дату 12 вересня 2020 року, але різними способами.

Requirements:
1. Метод nowExample має повернути поточну дату.
2. Метод ofExample має повернути дату 12 вересня 2020 року за допомогою методу LocalDate.of.
3. Метод ofYearDayExample має повернути дату 12 вересня 2020 року за допомогою методу LocalDate.ofYearDay.
4. Метод ofEpochDayExample має повернути дату 12 вересня 2020 року за допомогою методу LocalDate.ofEpochDay.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишіть тут ваш код
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишіть тут ваш код
        return LocalDate.of(2020,9,12);
    }

    static LocalDate ofYearDayExample() {
        //напишіть тут ваш код
        return LocalDate.ofYearDay(2020,256);
    }

    static LocalDate ofEpochDayExample() {
        //напишіть тут ваш код
        return LocalDate.ofEpochDay(18_517);
    }
}
