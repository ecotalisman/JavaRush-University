package ua.javarush.task.jdk13.task41.task4109;

/* 
Протоклони
У нас є ієрархія класів. Застосуємо до неї патерн Прототип, щоб можна було копіювати об'єкти CguRequisition та User.

1. У всіх класах ієрархії явно оголоси порожній конструктор без параметрів.

2. Додай до всіх класів альтернативний конструктор, що приймає як аргумент об'єкт поточного класу.
Цей конструктор повинен спочатку передати виконання батьківському конструктору, щоб той подбав про поля, оголошені в
суперкласі, а потім скопіювати з поданого об'єкта значення всіх полів, оголошених у межах поточного класу.

3. У класі AbstractEntity оголоси абстрактний метод AbstractEntity clone(). Реалізуй його в класах CguRequisition та User.
Метод повинен повертати новий об'єкт поточного класу, створений за допомогою конструктора з п.2.

Примітка: у конструкторі класу AbstractEntity викликати конструктор суперкласу не потрібно..

Примітка-2: у конструкторі класу RequisitionBase поле user має копіюватися за допомогою методу clone класу User.
У результаті код у методі main повинен компілюватися і виводити в консолі два різних об'єкти User.

Requirements:
1. У всіх класах ієрархії має бути оголошено порожній конструктор без параметрів.
2. У всіх класах ієрархії повинен бути конструктор, який приймає як аргумент об'єкт поточного класу, та який реалізовано
згідно з умовою.
3. У класі AbstractEntity має бути метод clone, реалізований у класах CguRequisition та User відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        CguRequisition prototype = new CguRequisition();
        prototype.id = 31;
        prototype.user = new User();
        prototype.user.displayName = "anonymous";

        CguRequisition requisitionClone = (CguRequisition) prototype.clone();
        System.out.println("Users should be different objects:");
        System.out.println(prototype.user + " - user");
        System.out.println(requisitionClone.user + " - cloned user");
        System.out.println(prototype.user.displayName);
        System.out.println(requisitionClone.user.displayName);
    }
}
