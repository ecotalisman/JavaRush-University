package ua.javarush.task.jdk13.task41.task4118.states;

import ua.javarush.task.jdk13.task41.task4118.ui.Player;

public abstract class State {
    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
