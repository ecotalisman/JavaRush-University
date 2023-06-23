package ua.javarush.task.pro.task16.task1614;

import java.time.Instant;

/*
Кінець часів
У класі Solution реалізуй три методи: - у методі getMaxFromMilliseconds поверни максимальний Instant, який можна
отримати за допомогою методу ofEpochMilli(long milliseconds); - у методі getMaxFromSeconds поверни максимальний Instant,
який можна отримати за допомогою методу ofEpochSecond(long seconds); - у методі getMaxFromSecondsAndNanos поверни
максимальний Instant, який можна отримати за допомогою методу ofEpochSecond(long seconds, long nanos).

Requirements:
1. Метод getMaxFromMilliseconds потрібно реалізувати згідно з умовою.
2. Метод getMaxFromSeconds потрібно реалізувати згідно з умовою.
3. Метод getMaxFromSecondsAndNanos потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишіть тут ваш код
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        //напишіть тут ваш код
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишіть тут ваш код
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
    }
}
