package ua.javarush.task.pro.task11.task1103;

/* 
Презентація роботів
У методі main створюються 5 роботів і виводиться інформація про них.
Видали максимально можливу кількість модифікаторів static так, щоб функціонал програми не змінився.
У методі main нічого змінювати не потрібно.


Requirements:
1. Модифікатори static мають бути правильно розміщені.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентація роботів, виготовлених компанією " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
