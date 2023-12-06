package ua.javarush.task.jdk13.task41.task4104.creature;

import ua.javarush.task.jdk13.task41.task4104.move.MoveLogic;
import ua.javarush.task.jdk13.task41.task4104.sound.SoundLogic;

public class Cat extends Creature {
    public Cat(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Кішка";
    }

    public void catchMice() {
        System.out.println(getName() + " ловить мишей.");
    }
}
