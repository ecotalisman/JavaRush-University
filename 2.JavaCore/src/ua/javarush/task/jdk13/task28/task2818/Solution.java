package ua.javarush.task.jdk13.task28.task2818;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* 
З ScheduledExecutor галактикою
У методі main передай до scheduledPool завдання TheUltimateQuestion.

Завдання має виконатися один раз через сім з половиною мільйонів роіків після запуску.

Метод main має вивести на екран результат виконання завдання.

Потрібно використовувати TimeUnit.DAYS. Вважаємо, що в році 365 днів.

Requirements:
1. Метод main має рівно один раз викликати в scheduledPool потрібний метод із правильними аргументами.
2. Метод main має вивести на екран результат виконання завдання.
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        ScheduledFuture<Integer> future = scheduledPool.schedule(
                new TheUltimateQuestion(),
                365L * 7_500_000L,
                TimeUnit.DAYS);

        System.out.println(future.get());
        scheduledPool.shutdown();
    }
}

/*

Метод get() в інтерфейсі Future призначений для отримання результату виконання обчислення, яке було поставлене у чергу
на виконання за допомогою механізму ExecutorService.

Ось як він працює:

1. Метод get() блокує поточний потік (паузує його виконання), доки обчислення не завершиться або не спливає максимальний
час очікування (timeout).

2. Якщо обчислення завершилося успішно, результат повертається методом get().

3. Якщо обчислення завершилося з помилкою (виникла виключна ситуація), то при спробі викликати get() буде виникати
ExecutionException, і ви повинні буде обробити цю виключну ситуацію.

4. Якщо під час очікування на результат поточний потік було перервано (interrupted), виникне InterruptedException.

****************************************************************************************************************************

Число 42 стало культовим завдяки фантастичному твору Дугласа Адамса "The Hitchhiker's Guide to the Galaxy"
(Путівник для першокласних у галактиці). У цій книзі, головний герой на ім'я Артур Дент знаходить себе в неймовірному
пригодницькому шляхетному подорожі крізь космос, після того як Землю ненавмисно знищили, щоб зробити місце для
гіперпросторового експрес-шляху. У цій книзі є загадкове питання "Останнє питання життя, Всесвіту і всього такого",
на яке шукають відповідь.

У фіктивному світі книги існує потужний суперкомп'ютер під назвою "Сенсорама", який був створений з метою відповісти
на саме це загадкове питання. Після багатьох тисяч років обчислень, коли вже відчувалося, що відповідь близька,
комп'ютер оголошує, що відповідь - це число 42. Проте, дуже швидко стає ясно, що насправді ніхто не розуміє, яке саме
питання було задано, і тому неможливо зрозуміти, як саме число 42 є правильною відповіддю.

Отже, "42" у творі Дугласа Адамса стало символом загадковості, складності і смішної незрозумілості життя, Всесвіту
та всього такого.

*/