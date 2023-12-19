package ua.javarush.task.jdk13.task43.task4306;

import org.apache.commons.lang3.ObjectUtils;

/*
У пошуку ботана

У місцевій школі з'явилася потреба у програмі, яка порівнює оцінки двох різних студентів та видає результат у вигляді рядка.

Зміст цього рядка залежить від того, чи є один з об'єктів, що порівнюються, null-об'єктом, чи є переможець, або ж результати однакові.

З цим нам допоможе статичний метод compare класу ObjectUtils бібліотеки apache commons.

Тобі потрібно:

У методі compareStudentGrades класу Solution перевірити обидва вхідні об'єкти на null і, якщо один або обидва
дорівнюють null, повернути повідомлення "Make sure there are no null objects".

Якщо null-об'єктів немає – порівняти всі оцінки обох студентів за допомогою методу compare класу ObjectUtils та
зберегти загальний результат.

Потім, якщо результат є позитивним або негативним, повернути повідомлення у вигляді "StudentName has a higher grades score",
де StudentName має дорівнювати імені першого або другого студента залежно від того, хто переміг.

Якщо результат дорівнює 0, поверни повідомлення "Student grades scores are equal".
P.S. Для вирішення цього завдання бажано використовувати бібліотеку apache commons lang3 версії 3.9.

Requirements:
1. Не змінюй клас Student.
2. Не змінюй метод main класу Solution.
3. Не змінюй сигнатуру методу compareStudentGrades.
4. Метод compareStudentGrades повинен повертати потрібний рядок, відповідно до умов.
*/

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        //напишіть тут ваш код

        if (!ObjectUtils.allNotNull(studentOne, studentTwo)) {
            return "Make sure there are no null objects";
        }

        int result = 0;

        result += ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
        result += ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());
        result += ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
        result += ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
        result += ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
        result += ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
        result += ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());

        if (result > 0) {
            return studentOne.getName() + " has a higher grades score";
        } else if (result < 0) {
            return studentTwo.getName() + " has a higher grades score";
        } else {
            return "Student grades scores are equal";
        }
    }
}
