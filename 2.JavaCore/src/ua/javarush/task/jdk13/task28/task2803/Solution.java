package ua.javarush.task.jdk13.task28.task2803;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

/* 
Magic class
У пакеті java.util.concurrent знайди таку реалізацію List, у якої:
1. Ітератор не містить будь-які дані, що додані до списку після створення ітератора;
2. Всередині дані зберігаються у вигляді масиву;
3. Ітератор гарантовано не кидає ConcurrentModificationException;
4. Допустимі всі елементи включно з null;
5. Виправ рядок List<String> list = null ... у методі main.

Requirements:
1. Клас Solution не можна змінювати.
2. Реалізацію методів startUpdatingThread та stopUpdatingThread змінювати не можна.
3. Реалізацію метода copyOnWriteSolution змінювати не можна.
4. Додай до main створення потрібного екземпляра List згідно з умовою завдання.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();

        // It was a condition:
//        List<String> list = null/* create object of this magic class here*/;

        // Change code here:
        List<String> list = new CopyOnWriteArrayList<>()/* create object of this magic class here*/;

        solution.startUpdatingThread(list);
        solution.copyOnWriteSolution(list);
        solution.stopUpdatingThread();

        /* Example output
size = 0
Element: s781859336
Element: s1453499757
Element: s911312405
Element: s-877520242
Element: s-1636258097
size = 5

Element2: s781859336
Element2: s1453499757
Element2: s911312405
Element2: s-877520242
Element2: s-1636258097
Element2: s-1739827856
Element2: s-938954654
Element2: s925086217
size = 8
         */
    }

    public void copyOnWriteSolution(List<String> list) throws InterruptedException {
        System.out.println("size = " + list.size());
        System.out.println();
        Thread.sleep(20);
        for (String element : list) {   // створює нову копію на момент створення ітератора
            System.out.println("Element: " + element);
        }
        System.out.println("size = " + list.size());
        System.out.println();
        Thread.sleep(20);

        for (String element : list) {  // створює нову копію на момент створення ітератора
            System.out.println("Element2: " + element);
        }
        System.out.println("size = " + list.size());
        stopUpdatingThread();
    }

    public void stopUpdatingThread() throws InterruptedException {
        t.interrupt();
        t.join();
    }

    private Thread t;

    private void startUpdatingThread(final List<String> list) {
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    list.add("s" + ThreadLocalRandom.current().nextInt());
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ignore) {
                    }
                }
            }
        });
        t.start();
    }
}

/*

В завданні потрібно використовувати реалізацію List із пакету java.util.concurrent, яка має декілька конкретних
властивостей. Одна з реалізацій, яка відповідає цим вимогам, це CopyOnWriteArrayList.

Ось як це зробити:

1) Імпортуйте CopyOnWriteArrayList.
2) Створіть екземпляр цього класу та ініціалізуйте list цим екземпляром.

CopyOnWriteArrayList - це реалізація List, яка використовує принцип "копіювання при записі". Це означає, що будь-які
зміни, які робляться у списку під час ітерації, не впливають на ітератор. Замість цього створюється новий масив,
і всі подальші зміни застосовуються до цього нового масиву. Тому ітератори, створені до зміни, будуть працювати на базі
оригінального масиву, вони не бачитимуть змін і не викликатимуть ConcurrentModificationException.

*/