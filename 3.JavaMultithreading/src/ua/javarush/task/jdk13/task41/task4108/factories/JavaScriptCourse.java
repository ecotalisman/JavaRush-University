package ua.javarush.task.jdk13.task41.task4108.factories;

import ua.javarush.task.jdk13.task41.task4108.juniors.JavaScriptJunior;
import ua.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import ua.javarush.task.jdk13.task41.task4108.middles.JavaScriptMiddle;
import ua.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import ua.javarush.task.jdk13.task41.task4108.seniors.JavaScriptSenior;
import ua.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse{
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}
