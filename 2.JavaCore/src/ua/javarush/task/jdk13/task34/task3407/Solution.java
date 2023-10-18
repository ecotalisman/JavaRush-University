package ua.javarush.task.jdk13.task34.task3407;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* 
Збирач типів
Реалізуй метод getTypes, який приймає один тип і має повернути множину типів, які містяться у вхідному типі. Наприклад,
поточний метод main повинен вивести на екран такі типи (types, порядок не важливий): interface java.util.Map class
java.util.concurrent.TimeUnit interface java.util.function.BiFunction class java.lang.Integer class java.lang.Long
class java.lang.Boolean interface java.util.List class java.lang.String Сигнатуру методу getTypes не змінюй.
Методи main() не беруть участі в тестуванні.

Requirements:
1. Сигнатуру і тип повертаємого значення типу getTypes не змінюй.
2. Метод getTypes потрібно реалізувати згідно з умовою завдання.
*/

public class Solution {

    private Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>> field;

    public static void main(String[] args) throws Exception {
        getTypes(Solution.class.getDeclaredField("field").getGenericType()).forEach(System.out::println);
    }

    public static Set<Type> getTypes(Type type) {
        //write code here:
        Set<Type> result = new HashSet<>();
        if (!(type instanceof ParameterizedType)) {
            result.add(type);
        } else {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            result.add(parameterizedType.getRawType());
            for (Type typeArgument : parameterizedType.getActualTypeArguments()) {
                result.addAll(getTypes(typeArgument));
            }
        }
        return result;
    }
}

/**
 * розглянемо, як працюють методи add і addAll та як працює метод getTypes.
 *
 * 1. result.add(item):
 * Цей метод використовується для додавання окремого елемента item до множини result.
 * Якщо елемент вже існує в множині, він не буде доданий повторно (оскільки множини не допускають дублікатів).
 * Наприклад:
 * result = {1, 2, 3}
 * Виклик result.add(4) змінить result до {1, 2, 3, 4}
 * Виклик result.add(3) не змінить result, тому що 3 вже існує в множині.
 *
 * 2. result.addAll(collection):
 * Цей метод використовується для додавання всіх елементів з колекції collection до множини result.
 * Якщо якийсь елемент вже існує в result, він не буде доданий повторно.
 * Наприклад:
 * result = {1, 2, 3}
 * collection = {3, 4, 5}
 * Після виклику result.addAll(collection), result буде {1, 2, 3, 4, 5}
 *
 * 3. Як працює getTypes:
 * Спочатку ініціалізується множина result для зберігання результатів.
 * Перевіряється, чи є вхідний type параметризованим типом (ParameterizedType). Якщо ні, він просто додається до result
 * і метод закінчується.
 * Якщо type є параметризованим, до result додається "сировий" тип (getRawType()). Для List<Integer>, "сировий" тип буде List.
 * Далі для кожного "внутрішнього" типу (так званого "актуального аргументу типу") з parameterizedTypeArgument викликається
 * рекурсивно метод getTypes. Це дозволяє обробляти вкладені параметризовані типи.
 * Наприклад, якщо type є Map<String, List<Integer>>, то спочатку буде оброблено Map, далі String і List<Integer>.
 * Після цього для List<Integer> знову буде викликано getTypes, щоб обробити List та Integer.
 *
 * Результат кожного рекурсивного виклику getTypes додається до result за допомогою методу addAll.
 * */
