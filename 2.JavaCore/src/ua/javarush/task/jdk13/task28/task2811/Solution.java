package ua.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* 
Знайомство з Executors
У методі main створи фіксований пул з 5 тредів, для цього використовуй клас Executors.
У циклі надішли на виконання до пулу 20 завдань Runnable.
У кожного завдання в методі run виклич метод doExpensiveOperation із порядковим номером завдання починаючи з 1.
Заборони додавання нових завдань на виконання до пулу (метод shutdown).
Дай пулу 5 секунд на завершення всіх завдань (метод awaitTermination і параметр TimeUnit.SECONDS).

Requirements:
1. За допомогою використання класу Executors, створи в методі main фіксований пул з 5 тредів.
2. Пул повинен приймати на виконання 20 завдань Runnable.
3. Кожне завдання повинне викликати метод doExpensiveOperation з порядковим номером завдання, починаючи з 1.
4. Заборони додавання нових завдань на виконання до пулу.
5. На завершення усіх завдань у пулі потрібно встановити 5 секунд.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишіть тут ваш код
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 20 ; i++) {
            final int taskId = i;
            executorService.submit(
                    () -> {
                        doExpensiveOperation(taskId);
                    }
            );
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
    }

    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }
}

/*

executorService.submit та executorService.execute - це два різних способи відправки завдань на виконання в пул потоків.
Основна відмінність полягає в тому, що submit повертає об'єкт Future, який дозволяє вам керувати та отримувати
результат виконання завдання.

Отже, якщо вам потрібно контролювати завдання та отримувати результати, використовуйте submit. Якщо ж вам потрібно
просто відправити завдання на виконання і вам не потрібно отримувати результат чи керувати завданням, тоді можна
використовувати execute.

Ваша оригінальна задача потребує обмежити кількість відправлених завдань до пула потоків та очікування їх завершення.
Оскільки вам потрібно коректно використовувати Future для контролю та очікування завершення, вибір submit є
більш прийнятним.

*/