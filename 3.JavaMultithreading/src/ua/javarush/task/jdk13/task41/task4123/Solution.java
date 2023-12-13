package ua.javarush.task.jdk13.task41.task4123;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/* 
Довіряй, але перевіряй ще раз

На прикладі цього абстрактного завдання ти закріпиш Блокування з подвійною перевіркою. Розберися, що відбувається у програмі.

Як бачиш, метод initDB вже синхронізований, і якщо запустити програму, всі потоки відпрацюють правильно і повернуть значення 100.

Але нині щоразу при зверненні до методу initDB відбувається синхронізація, хоча вона потрібна лише при першому зверненні
до методу. Виправ це:

- прибери метод synchronized;
- увесь код у if оберни на synchronized (this) {} блок;
- увесь код всередині synchronized блоку оберни в ще один if (isNull(users)) {}.

Якщо тепер запустити програму, лише один потік повертає 100.
Після того, як перший потік виконує рядок users = new HashMap<>();, інші потоки не заходять у блок synchronized,
а отримують не повністю заповнену карту users.
Спробуй це виправити: додай полю users модифікатор volatile.

Запусти програму — volatile не допомогло :)

У методі initDB всередині другого if-a створи локальну змінну Map<Integer, User>, і в циклі заповнюй її, а не users.
Після циклу треба присвоїти users значення цієї локальної змінної.

Тепер усе має працювати правильно ;)

Requirements:
1. Клас Solution не повинен змінюватися.
2. Не повинно бути синхронізації на рівні методу initDB.
3. У методі initDB має бути два блоки if та один блок synchronized відповідно до умови.
4. Поле users має бути volatile.
5. У методі initDB у другому if-і має використовуватися проміжна локальна карта згідно з умовою завдання.
*/

public class Solution {

    public static UserDB db = new UserDB();

    public static void main(String[] args) throws Exception {
        Set<Callable<Integer>> callables = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            callables.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    TimeUnit.MILLISECONDS.sleep(finalI);
                    return db.getDB().size();
                }
            });
        }

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = executor.invokeAll(callables);
        executor.awaitTermination(1, TimeUnit.SECONDS);
        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
