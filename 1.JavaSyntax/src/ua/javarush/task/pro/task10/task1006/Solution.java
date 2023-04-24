package ua.javarush.task.pro.task10.task1006;

/* 
Хто тут спадкоємець?
Ця задача потрібна, щоб зрозуміти, як викликається конструктор базового (батьківського) класу.
У тебе є класи ElectricCar, GasCar, HybridCar, які успадковують клас Car.
Тобі потрібно в конструкторах спадкоємців класу Car передати тип автомобіля в конструктор базового (батьківського)
класу, використовуючи super("тип автомобіля"). Для цього в класі Solution у методі main створи 3 об'єкти: HybridCar,
GasCar і ElectricCar.

Результат виведення має бути таким (у будь-якій послідовності):
Привіт. Я ElectricCar
Привіт. Я GasCar
Привіт. Я HybridCar


Requirements:
1. Класи ElectricCar, GasCar, HybridCar мають успадковуватися від класу Car.
2. Тіло конструктора класу Car не змінюй.
3. Спадкоємці класу Car мають викликати конструктор базового класу з відповідним аргументом.
4. У методі main має бути створено 3 об'єкти класів HybridCar, GasCar і ElectricCar.
5. Результат виведення має відповідати умові.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        new ElectricCar();
        new GasCar();
        new HybridCar();
    }
}
