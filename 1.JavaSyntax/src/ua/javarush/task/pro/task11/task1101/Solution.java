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

public class Solution {

    public static void main(String[] args) {

//        Was code:

//        System.out.println("Людство живе в Сонячній системі.");
//        System.out.println("Її вік близько 4568200000 років.");
//        System.out.println("У Сонячній системі 8 відомих планет.");
//        System.out.println("Так само, як і більшість зоряних систем, вона має 1 зорю.");
//        System.out.println("Зорю на ім'я Сонце.");
//        System.out.println("Відстань до центра галактики становить 27170 світлових років.");
//        System.out.println("Кожен мешканець Сонячної системи має знати цю інформацію!");

        System.out.println("Людство живе в Сонячній системі.");
        System.out.println("Її вік близько " + SolarSystem.age + " років.");
        System.out.println("У Сонячній системі " + SolarSystem.planetsCount + " відомих планет.");
        System.out.println("Так само, як і більшість зоряних систем, вона має " + SolarSystem.starsCount + " зорю.");
        System.out.println("Зорю на ім'я " + SolarSystem.starName + ".");
        System.out.println("Відстань до центра галактики становить " + SolarSystem.galacticCenterDistance + " світлових років.");
        System.out.println("Кожен мешканець Сонячної системи має знати цю інформацію!");

    }
}
