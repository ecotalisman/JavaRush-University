package ua.javarush.task.jdk13.task41.task4104.creature;

import ua.javarush.task.jdk13.task41.task4104.move.MoveLogic;
import ua.javarush.task.jdk13.task41.task4104.sound.SoundLogic;

public class Human extends Creature{
    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Людина";
    }

    public void searchMeaningOfLife() {
        System.out.println(getName() + " шукає сенс життя.");
    }
}
