package ua.javarush.task.pro.task16.task1609;

import java.time.LocalDate;

/* 
З роками молодшає
У 2010 році людині виповнилося 40 років. Ми спробували визначити рік, коли їй виповнилося 30 років, і програма видала
2020 рік. Як таке можливо? Зміни один символ у коді так, щоб програма вивела 2000 рік.

Requirements:
1. У коді потрібно змінити один символ, щоб програма вивела 2000 рік.
*/

public class Solution {

    public static void main(String[] args) {
        // It was a condition:
//        LocalDate jubilee40Years = LocalDate.of(-2010, 3, 13);

        // Change a code:
        LocalDate jubilee40Years = LocalDate.of(2010, 3, 13);

        LocalDate jubilee30Years = jubilee40Years.minusYears(10);

        System.out.println(Math.abs(jubilee30Years.getYear()));
    }
}
