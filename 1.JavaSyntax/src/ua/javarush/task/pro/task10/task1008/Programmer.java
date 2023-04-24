package ua.javarush.task.pro.task10.task1008;

/* 
Зарплата
У нас є клас Programmer, а в ньому є дуже важливе поле — salary. Наше завдання таке: треба додати можливість
отримати й змінити значення цього поля за допомогою гетера й сетера.
Але є нюанс: зарплату можна тільки підвищувати. Отож тобі потрібно додати в сетер перевірку: якщо значення
аргументу більше за поточне, то поле salary змінюємо, інакше — ігноруємо.


Requirements:
1. Клас Programmer має містити приватне (private) нестатичне поле salary типу int.
2. Клас Programmer має містити публічний гетер для поля salary.
3. Клас Programmer має містити публічний сетер для поля salary.
4. Сетер має змінювати значення поля salary, тільки якщо значення вхідного аргументу перевищує поточне значення.
*/

public class Programmer {
    private int salary = 1000;

    //напишіть тут ваш код

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
