package ua.javarush.task.jdk13.task28.task2810;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Залізобетонна зупинка
Реалізуй метод completeConcert. Тобі потрібно:

ініціювати зупинку сервісу executor;
почекати 2 секунди;
перевірити, чи зупинено сервіс executor;
якщо зупинено, нічого не робити;
якщо не зупинено, примусово зупинити його.

Requirements:
1. Метод completeConcert має ініціювати зупинку сервісу executor за допомогою методу shutdown.
2. Метод completeConcert повинен виділити 2 секунди на зупинку executor за допомогою метода
awaitTermination(2, TimeUnit.SECONDS).
3. Метод completeConcert не має більше нічого робити, якщо метод awaitTermination повернув true (executor зупинено).
4. Метод completeConcert має зупинити executor за допомогою методу shutdownNow, якщо метод awaitTermination повернув
false (executor продовжує працювати через 2 секунди).
*/

public class Solution {

    public static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        List<String> instruments = List.of("скрипка", "тромбон", "бубонці", "контрабас");
        for (String instrument : instruments) {
            executor.submit(new MusicalInstrument(instrument));
        }

        completeConcert();
    }

    public static void completeConcert() throws Exception {
        //напишіть тут ваш код
        executor.shutdown();
        if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
    }
}