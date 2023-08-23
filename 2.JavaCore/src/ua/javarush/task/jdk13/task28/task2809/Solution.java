package ua.javarush.task.jdk13.task28.task2809;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/* 
Багатопотоковість в одному потоці
Тобі потрібно модифікувати програму за допомогою використання newSingleThreadExecutor замість створення new Thread().

Для цього тобі потрібно створити ExecutorService, використати його метод submit(Callable) замість new Thread(), а в
кінці не забути його зупинити.

Requirements:
1. У класі Solution має бути публічне статичне поле executorService, ініціалізоване за допомогою
методу newSingleThreadExecutor.
2. У методі startPlaying створення new Thread() потрібно замінити на виклик методу submit(Callable)
сервісу executorService.
3. Сервіс executorService потрібно зупинити в кінці методу main за допомогою методу shutdown.
*/

public class Solution {
    // Add `executorService`:
    public static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        List<Future<String>> futures = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубонці", "контрабас");
        for (String instrument : instruments) {
            futures.add(startPlaying(instrument));
        }

        System.out.println("Встигли дограти: " + completeConcert(futures));

        // Add code here:
        executorService.shutdown();
    }

    public static Future<String> startPlaying(String name) {

        // It was a condition:
//        FutureTask<String> future = new FutureTask<>(new MusicalInstrument(name));
//        new Thread(future).start();

        Callable<String> callable = new MusicalInstrument(name);
        return executorService.submit(callable);
    }

    public static List<String> completeConcert(List<Future<String>> futures) {
        List<String> result = new ArrayList<>();
        for (Future<String> future : futures) {
            try {
                result.add(future.get(800, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                future.cancel(true);
            }
        }
        return result;
    }
}

/*

Це рішення невірне, і ось чому:

executorService.submit(
    () -> {
        new Thread(future);
    }
);

У цьому варіанті ви створюєте безіменний блок лямбда-виразу, а в цьому блоку ви просто створюєте новий об'єкт Thread
і передаєте йому future. Однак ви не викликаєте метод start() на створеному об'єкті Thread, тому цей потік ніколи
не буде запущений.

Другий варіант є правильним:

executorService.submit(future);

В цьому випадку ви просто передаєте future об'єкту ExecutorService, і цей сервіс сам виконає усі необхідні дії,
включаючи створення потоку та запуск FutureTask.

Тобто, використання executorService.submit(future) дозволяє сервісу ExecutorService взяти на себе управління потоками
та обробкою завдань, тому цей варіант є правильним.


public static Future<String> startPlaying(String name) {
    Callable<String> callable = new MusicalInstrument(name);

    return executorService.submit(callable);
}

У цьому випадку ви просто передаєте об'єкт MusicalInstrument, який реалізує інтерфейс Callable, без створення
додаткового потоку. executorService.submit(callable) самостійно відправляє завдання на виконання в ExecutorService.

****************************************************************************************************************************

1. Використання Callable з executorService.submit(callable):

public static Future<String> startPlaying(String name) {
    Callable<String> callable = new MusicalInstrument(name);

    return executorService.submit(callable);
}

У цьому підході ви створюєте об'єкт MusicalInstrument, який реалізує інтерфейс Callable. Інтерфейс Callable представляє
обчислювальне завдання, яке повертає результат і може кидати винятки. Ви передаєте цей об'єкт в
executorService.submit(callable), і сервіс виконує ваше завдання, отримуючи результат у вигляді об'єкта Future, який
представляє майбутній результат обчислення. Такий підхід більш сучасний і використовує більше функціональностей
стандартної бібліотеки для роботи з багатопотоковими обчисленнями.

2. Використання FutureTask з executorService.submit(future):

public static Future<String> startPlaying(String name) {
    FutureTask<String> future = new FutureTask<>(new MusicalInstrument(name));

    executorService.submit(future);

    return future;
}

У цьому підході ви використовуєте клас FutureTask, який реалізує інтерфейси Runnable та Future. Ви створюєте FutureTask
з об'єктом MusicalInstrument в конструкторі, і потім передаєте його в executorService.submit(future). executorService
запускає ваше завдання, і після завершення виконання результат можна отримати з FutureTask. Цей підхід використовує
менше абстракцій, але все ще є коректним.

Основна різниця полягає у використанні інтерфейсу Callable (перший підхід) проти використання Runnable і Future разом
(другий підхід). Обидва підходи спрямовані на роботу з асинхронними завданнями у багатопотокових середовищах, і ви
можете обирати між ними в залежності від вашого вподобання і потреб.

*/