package ua.javarush.task.pro.task13.task1310;

import java.util.HashMap;

/* 
Успішність студентів-2
У класі Solution оголошено поле grades типу HashMap<String, Double>, де ключ — ім'я та прізвище студента, а
значення —- його середня оцінка. Цього разу твоє завдання — реалізувати методи:
printStudents, який виводить тільки імена всіх студентів (ключ колекції);
getAverageMark, який повертає середній бал усіх студентів.

Requirements:
1. У класі Solution потрібно ініціалізувати публічне статичне поле grades типу HashMap<String, Double>.
2. Метод printStudents має виводити імена та прізвища всіх студентів із колекції grades (кожну пару з нового рядка).
3. Метод getAverageMark має повертати середній бал усіх студентів із колекції grades.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентів групи: ");
        printStudents();
        System.out.print("Середній бал групи: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давидов Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишіть тут ваш код
        for (String s : grades.keySet()) {
            System.out.println(s);
        }

    }

    public static Double getAverageMark() {
        //напишіть тут ваш код
        Double d = 0d;

//        for (String s : grades.keySet()) {
//            d += grades.get(s);
//        }

        Integer count = 0;
        for (Double value : grades.values()) {
            d += value;
            count++;
        }


        return d / count ;
    }
}
