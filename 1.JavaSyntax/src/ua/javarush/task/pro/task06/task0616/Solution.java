package ua.javarush.task.pro.task06.task0616;

/* 
Облік працівників
Перед тобою — цифрова облікова картка працівника. У ній вказано його ім'я, посаду й зарплату.
Ім'я працівника навряд чи зміниться, а ось посада й зарплата можуть. Такі зміни вносять за допомогою методів
setPosition() і setSalary(). Щоправда, наразі вони працюють неправильно.
Розберися, в чому причина, і виправ баги. Зауваж, що ні імена змінних класу, ні імена параметрів методів змінювати не можна.


Requirements:
1. Метод setPosition() має записувати отримане значення у змінну класу position.
2. Метод setSalary() має записувати отримане значення у змінну класу salary.
3. Змінювати імена змінних класу не можна.
4. Змінювати імена параметрів методів не можна.
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
