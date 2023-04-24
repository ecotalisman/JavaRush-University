package ua.javarush.task.pro.task07.task0714;

/* 
Успадкування змінних
Правильно успадкуй класи:

машину — від транспортного засобу;
електрокар — від машини.
Видали дублікати змінних.

Requirements:
1. Клас Car має успадковуватися від класу Vehicle.
2. Клас ElectricCar має успадковуватися від класу Car.
3. Змінні не повинні мати дублікатів.
*/

public class ElectricCar extends Car {

//    int wheelCount;
//    double weight;
    int electricEnginePower;
}
