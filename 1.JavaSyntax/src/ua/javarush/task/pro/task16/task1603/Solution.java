package ua.javarush.task.pro.task16.task1603;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Ремонтуємо формат
Виправ помилку так, щоб програма вивела "2010-01-06". Ініціалізацію змінної date не змінюй.

Requirements:
1. Програма має вивести: 2010-01-06
2. Потрібно виправити одну помилку.
*/

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        // it was a condition:
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mmmm-dd");

        // Write a code here:
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}
