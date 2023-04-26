package ua.javarush.task.pro.task11.task1102;

/* 
Земля: технічна характеристика
Зроби всі змінні класу Planet нестатичними.
Після цього внеси необхідні виправлення в метод main.


Requirements:
1. Усі змінні класу Planet мають бути нестатичними.
2. У методі main мають присвоюватися значення всім змінним об'єкта Planet earth.
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();

//        Code was comments cause not static:

//        Planet.name = "Земля";
//        Planet.age = 4_540_000_000L;
//        Planet.speed = 170_218;
//        Planet.area = 510_072_000;

        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;

        earth.printInformation();
    }
}
