package ua.javarush.task.jdk13.task28.task2817;

import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* 
Напівсекундомір
У методі main обери та виконай потрібний метод у scheduledPool, щоб він почав виводити на екран LocalTime.now().

Початкова затримка відсутня. Інтервал від початку одного запуску до початку наступного — півсекунди.

Приклад виведення:

08:12:27.557273100
08:12:28.048495200
08:12:28.552839300
08:12:29.046988900
08:12:29.553360
08:12:30.059767300

Requirements:
1. Метод main повинен лише один раз викликати потрібний метод у scheduledPool.
2. Завдання повинне запуститися без початкової затримки, з інтервалами у півсекунди між запусками.
3. Завдання, яке передається до scheduledPool, має виводити на екран LocalTime.now().
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Runnable task = () -> System.out.println(LocalTime.now());
        scheduledPool.scheduleAtFixedRate(task,0, 500, TimeUnit.MILLISECONDS);

        Thread.sleep(3000);
        scheduledPool.shutdown();
    }
}

/*

потрібно створити Runnable, який виводитиме поточний LocalTime.now() на екран, і передати цей Runnable до schedule()
з вказаною затримкою.

використано метод scheduleAtFixedRate(), який приймає Runnable, початкову затримку (0), і інтервал між запусками
(500 мілісекунд).

*/