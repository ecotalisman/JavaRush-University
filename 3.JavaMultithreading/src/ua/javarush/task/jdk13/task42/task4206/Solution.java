package ua.javarush.task.jdk13.task42.task4206;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
І знову черга
Переглянь код програми та розберися, що вона робить. Якщо запустити програму, отримуємо помилку.

Твоє завдання – виправити код таким чином, щоб програма працювала. Підказки шукай у вимогах.

Requirements:
1. Клас Solution не змінюй.
2. Клас Producer не змінюй.
3. Клас Consumer не змінюй.
4. У класі Storage має бути приватне final поле deque типу BlockingDeque<Integer>, яке має бути проініціалізоване LinkedBlockingDeque<>(2).
5. У методі take класу Storage повинен викликатися метод таке поля deque.
6. У методі put класу Storage повинен викликатися метод put поля deque з тим самим параметром.
*/

public class Solution {
    public static void main(String[] args) {
        Storage storage = new Storage();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Producer(storage));
        executor.execute(new Consumer(storage));
        executor.shutdown();
    }
}
