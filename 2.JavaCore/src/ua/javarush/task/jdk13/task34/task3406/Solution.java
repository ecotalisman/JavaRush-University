package ua.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/* 
Класні методи
Реалізуй метод getMethods, який приймає множину класів, і повинен повернути мапу, в якій ключ - це клас, а значення -
множина імен статичних методів цього класу. Сигнатуру методу getMethods не змінюй. Методи main() і print() не беруть
участі в тестуванні.

Requirements:
1. Сигнатуру і тип значення, що повертається, методу getMethods не змінюй.
2. Метод getMethods потрібно реалізувати згідно з умовою завдання.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        //write code here:
        return classes.stream()
                .collect(Collectors.toMap(
                        clazz -> clazz,
                        clazz -> Arrays.stream(clazz.getDeclaredMethods())
                                .filter(method -> Modifier.isStatic(method.getModifiers()))
                                .map(Method::getName)
                                .collect(Collectors.toSet())
                ));

        // Code using for-each:
//        Map<Class<?>, Set<String>> resultMap = new HashMap<>();
//
//        for (Class<?> clazz : classes) {
//            Set<String> staticMethods = new HashSet<>();
//            Method[] methods = clazz.getDeclaredMethods();
//
//            for (Method method : methods) {
//                if (Modifier.isStatic(method.getModifiers())) {
//                    staticMethods.add(method.getName());
//                }
//            }
//
//            if (!staticMethods.isEmpty()) {
//                resultMap.put(clazz, staticMethods);
//            }
//        }
//
//        return resultMap;
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
