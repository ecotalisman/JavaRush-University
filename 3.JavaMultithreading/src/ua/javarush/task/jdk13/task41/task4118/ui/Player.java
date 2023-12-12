package ua.javarush.task.jdk13.task41.task4118.ui;

import ua.javarush.task.jdk13.task41.task4118.states.ReadyState;
import ua.javarush.task.jdk13.task41.task4118.states.State;

import java.util.ArrayList;
import java.util.List;

// It was a condition:
//import static ua.javarush.task.jdk13.task41.task4118.ui.State.*;

public class Player {

    private State state;

    private boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    // It was a condition:
//    public Player() {
//        state = READY;
//        setPlaying(true);
//        for (int i = 1; i <= 12; i++) {
//            playlist.add("Track " + i);
//        }
//    }

    // Change code constructor:
    public Player() {
        state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

    // It was a condition:
//    public String onLock() {
//        playing = false;
//
//        switch (state) {
//            case LOCKED:
//                if (isPlaying()) {
//                    state = READY;
//                    return "Stop playing";
//                } else {
//                    return "Locked...";
//                }
//            case PLAYING:
//                state = LOCKED;
//                setCurrentTrackAfterStop();
//                return "Stop playing";
//            case READY:
//                state = LOCKED;
//                return "Locked...";
//        }
//        return "";
//    }
//
//    public String onPlay() {
//        switch (state) {
//            case LOCKED:
//                state = READY;
//                return "Ready";
//            case PLAYING:
//                state = READY;
//                return "Paused...";
//            case READY:
//                state = PLAYING;
//                return startPlayback();
//        }
//        return "";
//    }
//
//    public String onNext() {
//        switch (state) {
//            case LOCKED:
//            case READY:
//                return "Locked...";
//            case PLAYING:
//                return nextTrack();
//        }
//        return "";
//    }
//
//    public String onPrevious() {
//        switch (state) {
//            case LOCKED:
//            case READY:
//                return "Locked...";
//            case PLAYING:
//                return previousTrack();
//        }
//        return "";
//    }

}
