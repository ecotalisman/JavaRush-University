package ua.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public abstract class BoardGame {
    private int playersAmount;

    public final void start(int playersAmount) {
        setPlayersAmount(playersAmount);
        initialize();
        play();
        end();
        printWinner();
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

    protected abstract void initialize();

    protected abstract void play();

    protected abstract void end();

    protected void printWinner() {
        System.out.println("Переміг гравець № " + (new Random().nextInt(playersAmount) + 1));
    }
}
