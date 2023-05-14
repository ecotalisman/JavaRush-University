package ua.javarush.task.pro.task13.task1328;

import java.util.*;

/* 
Досягнення
На сайті JavaRush є різні досягнення, зокрема за певну кількість вирішених завдань.

Тобі потрібно реалізувати методи:

getReachedAchievements, який приймає мапу з досягненнями та кількість вирішених на даний момент завдань, а повертає
мапу вже отриманих досягнень;
getFutureAchievements, який також приймає мапу з досягненнями та кількість вирішених на даний момент завдань, але
повертає мапу майбутніх досягнень.

Requirements:
1. Сигнатуру і тип значення, що повертається, методу getReachedAchievements(TreeMap<Integer, String>, Integer) не змінюй.
2. Сигнатуру і тип значення, що повертається, методу getFutureAchievements(TreeMap<Integer, String>, Integer) не змінюй.
3. Метод getReachedAchievements повинен повернути мапу вже отриманих досягнень.
4. Метод getFutureAchievements повинен повернути мапу майбутніх досягнень.
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Один маленький крок");
        map.put(5, "Дай 5");
        map.put(10, "В 10-ку");
        map.put(50, "50 відтінків кодинга");
        map.put(100, "Центуріон");
        map.put(200, "Ефективність 200%");
        map.put(300, "300 спартанців");
        map.put(400, "Забіг на 400");
        map.put(500, "Багам тут не місце");
        map.put(600, "600 пострілів за хвилину");
        map.put(700, "Сезон полювання");
        map.put(800, "Стальний кодер");
        map.put(900, "100500 багів по тому");

        int tasksCount = 150;

        SortedMap<Integer, String> reachedAchievements = getReachedAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : reachedAchievements.entrySet()) {
            System.out.printf("У тебе є досягнення \"%s\" за %d вирішених задач%n", entry.getValue(), entry.getKey());
        }

        System.out.printf("%nЗараз у тебе %d вирішених задач%n%n", tasksCount);

        SortedMap<Integer, String> futureAchievements = getFutureAchievements(map, tasksCount);
        for (Map.Entry<Integer, String> entry : futureAchievements.entrySet()) {
            System.out.printf("Ти отримаєш досягнення \"%s\", якщо вирішиш %d задач%n", entry.getValue(), entry.getKey());
        }
    }

    public static SortedMap<Integer, String> getReachedAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        //напишіть тут ваш код
        return map.headMap(tasksCount, true);
    }

    public static SortedMap<Integer, String> getFutureAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
        //напишіть тут ваш код
        return map.tailMap(tasksCount, false);
    }
}

/*
Не потрібно повертати елементи типу Map.Entry<Integer, String>, тоді як очікується повернення значень типу
SortedMap<Integer, String>.

floorEntry(tasksCount) повертає найбільший ключ, менший або рівний tasksCount, що є правильним для вирішення завдання
отриманих досягнень.

ceilingEntry(tasksCount) повертає найменший ключ, більший або рівний tasksCount, що є правильним для вирішення
завдання майбутніх досягнень.

Тим не менше, нам потрібно повернути відсортовані мапи, що містять всі досягнення, які вже були отримані,
або які можуть бути отримані в майбутньому. Це можна зробити, використовуючи методи headMap() та tailMap().


public static SortedMap<Integer, String> getReachedAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
    return map.headMap(tasksCount, true);
}

public static SortedMap<Integer, String> getFutureAchievements(TreeMap<Integer, String> map, Integer tasksCount) {
    return map.tailMap(tasksCount, false);
}

У методі headMap(), другий аргумент встановлюється в true, щоб включити ключ tasksCount в повернену мапу, якщо він існує.

У методі tailMap(), другий аргумент встановлюється в false, щоб виключити ключ tasksCount з поверненої мапи.


*/