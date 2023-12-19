package ua.javarush.task.jdk13.task43.task4310;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
Яка операція 3
Визнач, яка операція здійснюється над множинами в методі compute.

Заміни код методу compute відповідним методом класу CollectionUtils, що виконує ту саму операцію.

P.S. Для вирішення цього завдання використовуй бібліотеку apache.commons.collections4 версії 4.4.

Requirements:
1. Заголовок методу compute не повинен змінюватися.
2. Метод compute повинен виконувати над множинами ту саму операцію, що раніше.
3. Код методу compute потрібно замінити викликом одного методу класу CollectionUtils.
*/

public class Solution {

    public static void main(String[] args) {
        Set<Integer> setA = Set.of(435, 12, 56, 1, 9066);
        Set<Integer> setB = Set.of(1, 435, 12, 56, 11, 9067);
        System.out.println(compute(setA, setB));
    }

    public static Collection<Integer> compute(Set<Integer> setA, Set<Integer> setB) {
        return CollectionUtils.subtract(setA, setB);

        // It was a condition:
//        Set<Integer> result = new HashSet<>();
//        result.addAll(setA);
//        result.removeAll(setB);
//        return result;
    }
}
