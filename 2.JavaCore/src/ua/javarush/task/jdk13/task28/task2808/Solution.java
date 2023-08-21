package ua.javarush.task.jdk13.task28.task2808;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* 
Мені не встигнути
Розберися, що робить програма. Спробуй запустити.

Реалізуй метод completeConcert. Тобі потрібно:

отримати результат роботи кожного завдання та додати його до результуючого списку рядків;
при отриманні результату роботи завдань, спочатку очікувати 800 мілісекунд, і потім, якщо завдання не повернуло результат, перервати його;
повернути список з результатами роботи завдань, які встигли виконатися.

Requirements:
1. Метод completeConcert повинен зробити запит на результат виконання кожного завдання зі вхідного списку.
2. Метод completeConcert має достроково завершити завдання, якщо воно не повернуло результат протягом 800 мілісекунд.
3. Метод completeConcert має повернути список з результатами роботы завдань, які встигли виконатися.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<FutureTask<String>> taskList = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубонці", "контрабас");
        for (String instrument : instruments) {
            taskList.add(startPlaying(instrument));
        }

        System.out.println("Встигли дограти: " + completeConcert(taskList));
    }

    public static FutureTask<String> startPlaying(String name) {
        FutureTask<String> task = new FutureTask<>(new MusicalInstrument(name));
        new Thread(task).start();
        return task;
    }

    public static List<String> completeConcert(List<FutureTask<String>> taskList) throws ExecutionException, InterruptedException {
        //напишіть тут ваш код
        List<String> results = new ArrayList<>();

        for (FutureTask<String> task : taskList) {
            try {
                String result = task.get(800, TimeUnit.MILLISECONDS);
                results.add(result);
            } catch (TimeoutException e) {
                task.cancel(true);
            }
        }
        return results;
    }
}