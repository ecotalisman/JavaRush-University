package ua.javarush.task.pro.task13.task1311;

import java.util.HashMap;
import java.util.Map;

/* 
Успішність студентів-3
У класі Solution оголошено поле grades типу HashMap<String, Double>, де ключ — ім'я та прізвище студента,
а значення —- його середня оцінка. Спробуймо створити один метод, який виводитиме повну інформацію про студентів,
використовуючи метод entrySet класу HashMap.

Виводити потрібно такі дані: [повне ім'я] : [середня оцінка]
Для студента Андрій Петренко із середнім балом 4.5 має бути виведено таке:
Андрій Петренко : 4.5


Requirements:
1. У класі Solution потрібно ініціалізувати публічне статичне поле grades типу HashMap<String, Double>.
2. Метод printStudentsInfo має виводити текст у консоль відповідно до умови.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        //напишіть тут ваш код

        // this isn't correct answer:
//        for (String s : grades.keySet()) {
//            System.out.println(s + " : " + grades.get(s));
//        }

        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
