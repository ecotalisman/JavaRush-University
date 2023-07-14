package ua.javarush.task.jdk13.task11.task1112;

/* 
Конструюємо "дирчик"
Щоб у кожного авто був свій двигун, створи приватне незмінне поле engine у класі Car.

Поле має ініціалізуватися новим двигуном при створенні авто.

Методи авто мають викликати відповідні методи двигуна.

Requirements:
1. Не можна змінювати клас Engine.
2. У класі Car має бути поле engine.
3. Поле engine має ініціалізуватися при створенні об'єкта Car.
4. Методи класу Car (start і turnOff) мають викликати відповідні методи класу Engine.
*/

public class Solution {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.turnOff();
    }
}
