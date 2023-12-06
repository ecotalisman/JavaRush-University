package ua.javarush.task.jdk13.task41.task4104;

public class SwimmingMeowingHuman implements Creature {
    @Override
    public void move() {
        System.out.println("Людина гребе ластами.");
    }

    @Override
    public void sound() {
        System.out.println("Людина нявкає.");
    }

    public void searchMeaningOfLife() {
        System.out.println("Людина шукає сенс життя.");
    }
}
