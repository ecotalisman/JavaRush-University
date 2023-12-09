package ua.javarush.task.jdk13.task41.task4113;

import java.util.*;
import java.util.concurrent.*;

/* 
Тотальна ітерація
Реалізуй метод getIterators, який повинен повертати список ітераторів, дотримуючись таких умов:

всі елементи повинні бути реалізаціями інтерфейсу Iterator;
додай до списку об'єкти хоча б 20 різних класів;
класи всіх об'єктів мають бути з пакету java.util або підпакетів.

Requirements:
1. Усі об'єкти у списку мають реалізовувати інтерфейс Iterator.
2. У списку мають бути об'єкти щонайменше 20 різних класів.
3. Усі об'єкти у списку мають бути класами з пакету java.util чи підпакетів.
*/

public class Solution {

    public static void main(String[] args) {
        getIterators().stream()
                .map(i -> i.getClass().getCanonicalName())
                .sorted()
                .forEach(System.out::println);
    }

    public static List<Iterator> getIterators() {
        //напишіть тут ваш код
        List<Iterator> iterators = new ArrayList<>();

        // Collections
        iterators.add(new ArrayList<>().iterator());
        iterators.add(new LinkedList<>().iterator());
        iterators.add(new HashSet<>().iterator());
        iterators.add(new LinkedHashSet<>().iterator());
        iterators.add(new TreeSet<>().iterator());
        iterators.add(new PriorityQueue<>().iterator());
        iterators.add(new ArrayDeque<>().iterator());
        iterators.add(new Vector<>().iterator());
        iterators.add(new Stack<>().iterator());
        iterators.add(new ConcurrentLinkedQueue<>().iterator());
        iterators.add(new CopyOnWriteArrayList<>().iterator());

        // Map
        Map<String, String> hashMap = new HashMap<>();
        iterators.add(hashMap.keySet().iterator());
        iterators.add(hashMap.values().iterator());
        iterators.add(hashMap.entrySet().iterator());

        Map<String, String> treeMap = new TreeMap<>();
        iterators.add(treeMap.keySet().iterator());
        iterators.add(treeMap.values().iterator());
        iterators.add(treeMap.entrySet().iterator());

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        iterators.add(linkedHashMap.keySet().iterator());
        iterators.add(linkedHashMap.values().iterator());
        iterators.add(linkedHashMap.entrySet().iterator());

        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        iterators.add(concurrentHashMap.keySet().iterator());
        iterators.add(concurrentHashMap.values().iterator());
        iterators.add(concurrentHashMap.entrySet().iterator());

        // Special Collections
        iterators.add(Collections.emptySet().iterator());
        iterators.add(Collections.emptyList().iterator());
        iterators.add(Collections.emptyMap().keySet().iterator());

        // Singleton Collections
        iterators.add(Collections.singleton("test").iterator());
        iterators.add(Collections.singletonList("test").iterator());
        iterators.add(Collections.singletonMap("key", "value").keySet().iterator());

        // Enumeration as Iterator
        Enumeration<String> enumeration = new Vector<String>().elements();
        iterators.add(enumeration.asIterator());

        return iterators;
    }
}
