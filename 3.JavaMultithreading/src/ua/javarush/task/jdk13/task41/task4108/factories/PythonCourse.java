package ua.javarush.task.jdk13.task41.task4108.factories;

import ua.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import ua.javarush.task.jdk13.task41.task4108.juniors.PythonJunior;
import ua.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import ua.javarush.task.jdk13.task41.task4108.middles.PythonMiddle;
import ua.javarush.task.jdk13.task41.task4108.seniors.PythonSenior;
import ua.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse{
    @Override
    public JuniorDeveloper createJunior() {
        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
