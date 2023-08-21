package ua.javarush.task.jdk13.task28.task2807;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

/* 
Оркестр з бубонцями
Розберися, що робить програма. Спробуй запустити.

Тобі потрібно реалізувати метод completeConcert, який має перевіряти всі завдання в отриманому списку. Якщо завдання
ще не завершено, completeConcert має завершити його примусово.

Requirements:
1. Метод completeConcert повинен перевірити кожне завдання з отриманого списку: завершилося воно чи ні.
2. Метод completeConcert повинен достроково завершити всі незавершені завдання.
3. Метод completeConcert не повинен нічого робити із завершеними завданнями.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<FutureTask<String>> taskList = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубонці", "контрабас");
        for (String instrument : instruments) {
            taskList.add(startPlaying(instrument));
        }

        Thread.sleep(1000);
        completeConcert(taskList);
    }

    public static FutureTask<String> startPlaying(String name) {
        FutureTask<String> task = new FutureTask<>(new MusicalInstrument(name));
        new Thread(task).start();
        return task;
    }

    public static void completeConcert(List<FutureTask<String>> taskList) {
        //напишіть тут ваш код
        for (FutureTask<String> task : taskList) {
            if (!task.isDone()) {
                task.cancel(true);
            }
        }
    }
}