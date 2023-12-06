package ua.javarush.task.jdk13.task41.task4104;

public class CrawlingBarkingCow implements Creature {
    @Override
    public void move() {
        System.out.println("Корова повзе звиваючись.");
    }

    @Override
    public void sound() {
        System.out.println("Корова гавкає.");
    }

    public void giveMilk() {
        System.out.println("Корова дає молоко.");
    }
}
