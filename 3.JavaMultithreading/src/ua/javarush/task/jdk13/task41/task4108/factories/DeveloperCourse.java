package ua.javarush.task.jdk13.task41.task4108.factories;

import ua.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import ua.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import ua.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

public interface DeveloperCourse {
    JuniorDeveloper createJunior();

    MiddleDeveloper createMiddle();

    SeniorDeveloper createSenior();
}
