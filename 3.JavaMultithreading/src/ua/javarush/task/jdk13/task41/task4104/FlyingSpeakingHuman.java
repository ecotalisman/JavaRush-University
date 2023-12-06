package ua.javarush.task.jdk13.task41.task4104;

public class FlyingSpeakingHuman implements Creature {
    @Override
    public void move() {
        System.out.println("Людина махає крилами.");
    }

    @Override
    public void sound() {
        System.out.println("Людина каже.");
    }

    public void searchMeaningOfLife() {
        System.out.println("Людина шукає сенс життя.");
    }
}
