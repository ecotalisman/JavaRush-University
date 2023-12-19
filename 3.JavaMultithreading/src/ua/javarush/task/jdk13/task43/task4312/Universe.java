package ua.javarush.task.jdk13.task43.task4312;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Universe {
    private static Universe instance;

    private final Set<String> laws = new HashSet<>();

    private Universe() {
        laws.add("швидкість світла");
        laws.add("гравітаційна постійна");
        laws.add("постійна Планка");
        laws.add("маса електрона");
        laws.add("маса протону");
        laws.add("заряд електрона");
    }

    public static Universe getInstance() {
        if (instance == null) {
            instance = new Universe();
        }
        return instance;
    }

    public Set<String> getLaws() {
        return Collections.unmodifiableSet(laws);

        // It was a condition:
//        return laws;
    }
}
