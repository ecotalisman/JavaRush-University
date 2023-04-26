package ua.javarush.task.pro.task11.task1102;

/* 
Земля: технічна характеристика
Зроби всі змінні класу Planet нестатичними.
Після цього внеси необхідні виправлення в метод main.


Requirements:
1. Усі змінні класу Planet мають бути нестатичними.
2. У методі main мають присвоюватися значення всім змінним об'єкта Planet earth.
*/

public class Planet {

//    This code was in the condition, so it was commented out and delete 'static' words:

//    public static String name;
    public String name;

//    public static long age;
    public long age;

//    public static int speed;
    public int speed;

//    public static int area;
    public int area;

    public void printInformation() {
        System.out.println("Ім'я планети: " + name + ".");
        System.out.println("Вік: " + age + " років.");
        System.out.println("Орбітальна швидкість: " + speed + " км/год.");
        System.out.println("Загальна площа: " + area + " кв. км.");
    }
}
