package ua.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
Реалізуй допоміжні методи в класі Solution, які мають створювати відповідну колекцію та розміщувати туди об'єкти,
які передаються.
Методи newArrayList, newHashSet параметризируй типом T.
Метод newHashMap параметризируй типами К(ключ) і V(значення). Аргументи методу newHashMap повинні приймати списки,
в яких містяться нащадки типів K і V.
Колекції, що повертаються, повинні бути такого ж типу, що й об'єкти, які передаються до методу.

Підказка: у методі newHashMap потрібно перевірити, щоб списки ключів та значень збігалися за розміром. Якщо не збігаються,
кинь IllegalArgumentException.

Requirements:
1. Метод newArrayList потрібно параметризувати типом Т.
2. Метод newArrayList має повертати ArrayList, який містить об'єкти, що передаються до методу.
3. Метод newHashSet потрібно параметризувати типом Т.
4. Метод newHashSet має повертати HashSet, який містить об'єкти, що передаються до методу.
5. Метод newHashMap потрібно параметризувати типами K і V.
6. Метод newHashMap має повертати HashMap, який містить ключі та значення, що передаються до методу.
7. Метод newHashMap повинен кидати IllegalArgumentException, якщо списки ключів і значень не збігаються за розміром.
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //напишіть тут ваш код
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишіть тут ваш код
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List <? extends V> values) {
        //напишіть тут ваш код
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("List of keys and values must have the same size!");
        }
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}

/*

В Java, при оголошенні дженериків, вони визначаються на рівні метода або класу. В даному випадку, ми оголошуємо дженерик
на рівні метода, тому визначення йде після ключового слова static та перед типом повернення метода.

В оголошенні метода:

public static <T> ArrayList<T> newArrayList(T... elements)

<T> після static - це оголошення дженерика. Воно говорить компілятору, що ми використовуємо параметр типу T в цьому методі.

ArrayList<T> - це конкретний тип об'єкта, який буде повернено цим методом.

T... elements - це параметри метода, які ми передаємо. Знову ж таки, ми використовуємо T тут, щоб позначити, що тип
елементів може бути будь-яким типом, відповідно до того, як ми викликаємо цей метод.

Таким чином, <T> після static та <T> після ArrayList - це не одне й те ж. Перше - це оголошення дженерика, а друге -
це використання цього дженерика.

*/