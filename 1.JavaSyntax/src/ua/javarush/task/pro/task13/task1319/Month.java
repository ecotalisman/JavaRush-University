package ua.javarush.task.pro.task13.task1319;

/* 
Місяці в порах року
Додай в enum Month 4 методи: getWinterMonths(), getSpringMonths(), getSummerMonths() і getAutumnMonths(),
які повертатимуть масив із трьома місяцями.

Requirements:
1. Публічний статичний метод getWinterMonths() має повертати масив із зимовими місяцями.
2. Публічний статичний метод getSpringMonths() має повертати масив із весняними місяцями.
3. Публічний статичний метод getSummerMonths() повинен повертати масив із літніми місяцями.
4. Публічний статичний метод getAutumnMonths() повинен повертати масив з осінніми місяцями.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишіть тут ваш код

    public static Month[] getWinterMonths(){
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths(){
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths(){
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonths(){
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }



    // It's My First solution
    // The code below is not necessary for the solution:

//    public static ArrayList<Month> getWinterMonths(){
//        ArrayList<Month> winter = new ArrayList<>();
//        Collections.addAll(winter, DECEMBER, JANUARY, FEBRUARY);
//        return winter;
//    }
//    public static ArrayList<Month> getSpringMonths(){
//        ArrayList<Month> spring = new ArrayList<>();
//        Collections.addAll(spring, MARCH, APRIL, MAY);
//        return spring;
//    }
//    public static ArrayList<Month> getSummerMonths(){
//        ArrayList<Month> summer = new ArrayList<>();
//        Collections.addAll(summer, JUNE, JULY, AUGUST);
//        return summer;
//    }
//    public static ArrayList<Month> getAutumnMonths(){
//        ArrayList<Month> autumn = new ArrayList<>();
//        Collections.addAll(autumn, SEPTEMBER, OCTOBER, NOVEMBER);
//        return autumn;
//    }
}
