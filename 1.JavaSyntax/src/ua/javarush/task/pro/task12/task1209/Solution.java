package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерія
У класі Solution є список працівників waitingEmployees, які чекають на зарплату, і список працівників
alreadyGotSalaryEmployees, які вже її отримали. Потрібно реалізувати метод paySalary(String). Як аргумент у метод слід
передати ім'я працівника, котрий бажає отримати зарплату.
Метод має перевірити наявність працівника в списку waitingEmployees, і якщо він ще не отримав зарплату, видати її:
Якщо параметр методу paySalary(String) дорівнює null, нічого робити не треба.
Додати ім'я працівника в список alreadyGotSalaryEmployees.
У списку waitingEmployees замінити ім'я працівника на null.

Requirements:
1. Метод paySalary(String) має додавати в список alreadyGotSalaryEmployees ім'я працівника, якщо воно є в списку
waitingEmployees.
2. Метод paySalary(String) має заміняти ім'я працівника на значення null, якщо воно є в списку waitingEmployees.
3. Метод paySalary(String) не повинен змінювати списки waitingEmployees і alreadyGotSalaryEmployees, якщо переданого
імені немає в списку waitingEmployees.
4. Якщо в метод paySalary(String) передається null, метод не повинен додавати це значення у waitingEmployees або
alreadyGotSalaryEmployees.
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишіть тут ваш код
        if (name != null && waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
