package ua.javarush.task.pro.task11.task1103;

/* 
Презентація роботів
У методі main створюються 5 роботів і виводиться інформація про них.
Видали максимально можливу кількість модифікаторів static так, щоб функціонал програми не змінився.
У методі main нічого змінювати не потрібно.


Requirements:
1. Модифікатори static мають бути правильно розміщені.
*/

public class Robot {

    public static int robotCounter;

//    This code was in the condition, so it was commented out and delete 'static' words:

//    public static int id;
    public int id;

//    public static String model;
    public String model;

//    public static int productionYear;
    public int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й із %d роботів. Модель: %s. Виготовлений компанією %s у %d році.\n",
                 id, robotCounter, model, vendor, productionYear);
    }
}
