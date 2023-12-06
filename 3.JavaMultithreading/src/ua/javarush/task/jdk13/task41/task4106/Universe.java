package ua.javarush.task.jdk13.task41.task4106;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class Universe {
    private static Universe universe;
    private final Set<String> laws = new HashSet<>();

    private Universe() {
        System.out.println("Починається тонке налаштування незаперечних законів всесвіту...");
        tune("швидкість світла");
        tune("гравітаційна постійна");
        tune("постійна Планка");
        tune("маса електрона");
        tune("маса протону");
        tune("заряд електрона");
        System.out.println("Fine-tuning the laws of the universe is complete.");
    }

    public Set<String> getLaws() {
        return Collections.unmodifiableSet(laws);
    }

    private void tune(String low) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("встановлюється " + low);
        laws.add(low);
    }

    public static Universe getInstance() {
        if (universe == null) {
            universe = new Universe();
        }
        return universe;
    }
}
