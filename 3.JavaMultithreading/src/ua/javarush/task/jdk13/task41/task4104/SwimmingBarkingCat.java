package ua.javarush.task.jdk13.task41.task4104;

public class SwimmingBarkingCat implements Creature {
    @Override
    public void move() {
        System.out.println("Кішка гребе ластами.");
    }

    @Override
    public void sound() {
        System.out.println("Кішка гавкає.");
    }

    public void catchMice() {
        System.out.println("Кішка ловить мишей.");
    }
}
