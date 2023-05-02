package ua.javarush.task.pro.task11.task1101;

/* 
Сонячна система — наш дім
Програма виводить на екран основні факти про Сонячну систему.
Перепиши код так, щоб для виведення на екран використовувалися всі змінні класу SolarSystem, однак результат роботи програми не змінився.

Очікуваний результат на екрані:
Людство живе в Сонячній системі.
Її вік близько 4568200000 років.
У Сонячній системі 8 відомих планет.
Так само, як і більшість зоряних систем, вона має 1 зорю.
Зорю на ім'я Сонце.
Відстань до центра галактики становить 27170 світлових років.
Кожен мешканець Сонячної системи має знати цю інформацію!


Requirements:
1. Програма має виводити на екран текст, зазначений у прикладі.
2. Для виведення тексту слід використати всі змінні класу SolarSystem.
*/

public class SolarSystem {

    public static long age = 4_568_200_000L;

    public static int planetsCount = 8;

    public static int starsCount = 1;

    public static String starName = "Сонце";

    public static int galacticCenterDistance = 27170;


}