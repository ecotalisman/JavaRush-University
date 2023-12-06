package ua.javarush.task.jdk13.task41.task4104;

public class CrawlingMeowingCat implements Creature {
    @Override
    public void move() {
        System.out.println("Кішка повзе звиваючись.");
    }

    @Override
    public void sound() {
        System.out.println("Кішка нявкає.");
    }

    public void catchMice() {
        System.out.println("Кішка ловить мишей.");
    }
}
