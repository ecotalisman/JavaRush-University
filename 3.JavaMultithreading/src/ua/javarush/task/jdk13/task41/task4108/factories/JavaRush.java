package ua.javarush.task.jdk13.task41.task4108.factories;

import ua.javarush.task.jdk13.task41.task4108.juniors.JavaJunior;
import ua.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import ua.javarush.task.jdk13.task41.task4108.middles.JavaMiddle;
import ua.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import ua.javarush.task.jdk13.task41.task4108.seniors.JavaSenior;
import ua.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}
