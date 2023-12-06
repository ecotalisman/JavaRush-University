package ua.javarush.task.jdk13.task41.task4104;

public class FlyingSpeakingСow implements Creature {
    @Override
    public void move() {
        System.out.println("Корова махає крилами.");
    }

    @Override
    public void sound() {
        System.out.println("Корова каже.");
    }

    public void giveMilk() {
        System.out.println("Корова дає молоко.");
    }
}
