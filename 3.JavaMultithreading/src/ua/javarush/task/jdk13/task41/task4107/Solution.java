package ua.javarush.task.jdk13.task41.task4107;

import ua.javarush.task.jdk13.task41.task4107.factory.DotNetCourse;
import ua.javarush.task.jdk13.task41.task4107.factory.JavaRush;
import ua.javarush.task.jdk13.task41.task4107.factory.KotlinCourse;
import ua.javarush.task.jdk13.task41.task4107.factory.ProgrammingCourse;

/* 
Кузня кадрів
Відпрацюй навичку створення фабричних методів:

У пакеті developers створи інтерфейс Developer і приведи до нього всі класи пакета.
В інтерфейсі мають бути методи study та writeCode.
У кореневій папці завдання створи пакет factory, а в ньому – абстрактний клас ProgrammingCourse.
У класі додай публічний абстрактний метод createDeveloper, який повертає Developer (це і буде твій фабричний метод).
Ще додай публічний void метод educateStudent, який за допомогою createDeveloper створює об'єкт Developer і викликає у нього метод study.
У пакеті factory створи три класи: JavaRush, KotlinCourse та DotNetCourse.
Додай їм успадкування від ProgrammingCourse. Реалізуй у них фабричний метод, який повинен створювати та повертати програміста відповідного типу.
Розкоментуй код у класі Solution і перевір, чи все працює.

Requirements:
1. У пакеті developers має бути інтерфейс Developer. Інші класи в пакеті повинні його реалізовувати.
2. У пакеті factory повинен бути клас ProgrammingCourse з методами createDeveloper та educateStudent відповідно до умови.
3. У пакеті factory повинні бути класи JavaRush, KotlinCourse та DotNetCourse, що реалізовані відповідно до умови.
*/

import ua.javarush.task.jdk13.task41.task4107.factory.DotNetCourse;
import ua.javarush.task.jdk13.task41.task4107.factory.JavaRush;
import ua.javarush.task.jdk13.task41.task4107.factory.KotlinCourse;
import ua.javarush.task.jdk13.task41.task4107.factory.ProgrammingCourse;

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
