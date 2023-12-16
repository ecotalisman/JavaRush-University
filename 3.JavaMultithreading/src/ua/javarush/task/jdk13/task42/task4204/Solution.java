package ua.javarush.task.jdk13.task42.task4204;

import java.util.*;
import java.util.concurrent.*;

/* 
Потоконебезпечна карта
Розберися, що робить програма. Якщо уважно поглянути на код, можна помітити, що у цьому завданні використовуються потоки.
А використовувати звичайну карту разом із потоками небезпечно, а точніше "потоконебезпечно" ;)

Заміни у вирішенні звичайну карту на потокобезпечну (дивися вимоги), а також скористайся одним із методів цієї карти, щоб оптимізувати код.

Requirements:
1. Клас Key не змінюй.
2. Клас Solution повинен містити private static final поле ConcurrentHashMap<Key, Integer> MAP.
3. Після рефакторингу функціонал програми має змінитися.
4. У методі main потрібно викликати метод replace об'єкта ConcurrentHashMap.
*/

public class Solution {
    private static final int THREAD_POOL_SIZE = 50;
    private static final int TIMEOUT = 10;
    private static final int STEPS = 100;
    private static final int MAP_SIZE = 30;
    private static final int VALUE_LIMIT = 5;
    private static final int VALUE_MULTIPLIER = 10;

    private static final List<Key> KEYS = new ArrayList<>();
    private static final ConcurrentHashMap<Key, Integer> MAP = new ConcurrentHashMap<>();

    // It was a condition:
//    private static final Map<Key, Integer> MAP = new HashMap<>();


    static {
        for (int i = 0; i < MAP_SIZE; i++) {
            Key key = new Key();
            KEYS.add(key);
            MAP.put(key, i % VALUE_LIMIT + 1);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        printMap(MAP);

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < STEPS; i++) {
            int index = i % MAP_SIZE;
            Key key = KEYS.get(index);

            Runnable task = () -> {
                Integer currentValue = MAP.get(key);
                if (currentValue != null && currentValue.equals(key.getIntField())) {
                    MAP.replace(key, currentValue * VALUE_MULTIPLIER);
                }

                // It was a condition:
//                if (MAP.get(key) == key.getIntField())
//                    MAP.put(key, MAP.get(key) * VALUE_MULTIPLIER);
            };

            executor.submit(task);
        }

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);

        executor.shutdown();

        printMap(MAP);
    }

    public static void printMap(Map<Key, Integer> map) {
        for (Map.Entry<Key, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
}

