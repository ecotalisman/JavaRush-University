package ua.javarush.task.pro.task13.task1329;

import java.util.*;

/* 
Зламана база даних
Під час виведення на екран даних із бази даних (у нашій програмі це структура TreeMap) виводиться багато зайвого,
тому що ми видалили частину даних. Для виведення актуальної інформації необхідно використовувати крайні значення id із бази.

Для визначення цих значень необхідно реалізувати методи getMinId і getMaxId.

Подсказка:: TreeMap реалізує інтерфейс SortedMap, ви можете використовувати методи цього інтерфейсу.


Requirements:
1. Сигнатуру і тип значення, що повертається, методу getMaxId(TreeMap<Integer, String>) не змінюй.
2. Сигнатуру і тип значення, що повертається, методу getMaxId(TreeMap<Integer, String>) не змінюй.
3. Метод getMinId має бути реалізований згідно з умовою.
4. Метод getMaxId має бути реалізований згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5533, "Head First Java");
        map.put(5536, "Java. Посібник для початківців");
        map.put(5535, "Java для чайників");
        map.put(5540, "Java. Повний посібник");
        map.put(5531, "Java. Бібліотека професіонала");
        map.put(5538, "Java. Методи програмування");
        map.put(5532, "Java. Довідник розробника");
        map.put(5539, "Java SE 9. Базовий курс");
        map.put(5537, "Effective Java");
        map.put(5534, "Філософія Java");

        for (int i = getMinId(map); i <= getMaxId(map); i++) {
            System.out.printf("%d %s %n", i, map.get(i));
        }
    }

    public static Integer getMinId(TreeMap<Integer, String> map) {
        // It was a condition
//        return 0;

        //напишіть тут ваш код
        return map.firstKey();
    }

    public static Integer getMaxId(TreeMap<Integer, String> map) {
        // It was a condition
//        return 10_000;

        //напишіть тут ваш код
        return map.lastKey();
    }
}

/*
Ми використали методи firstKey() та lastKey(), які відповідно повертають найменший та найбільший ключі в TreeMap.

Ці методи є частиною інтерфейсу SortedMap, який реалізує TreeMap. Вони допомагають нам визначити крайні
(мінімальний та максимальний) ключі в мапі, що є дуже зручним при роботі з відсортованими даними.

В цьому випадку, ми використовуємо ці методи для отримання мінімального та максимального ID (які слугують ключами)
в нашій мапі TreeMap. Це працює, тому що TreeMap автоматично сортує свої ключі в порядку зростання.

Отже, ми правильно використали firstKey() та lastKey() для визначення мінімального та максимального ID в мапі.
Ці значення використовуються в циклі for у main() для виведення відсортованого списку книг.
*/