package ua.javarush.task.jdk13.task35.task3501;

/* 
Виклик статичного методу
Зміни статичний метод у класі GenericStatic так, щоб він став дженеріком.
Приклад виклику подано в методі main.

Requirements:
1. Метод someStaticMethod у класі GenericStatic потрібно змінити згідно з умовою завдання.
2. Метод someStaticMethod має бути статичним.
3. Метод someStaticMethod має бути публічним.
4. Метод someStaticMethod має виводити дані на екран.
*/

public class Solution {
    public static void main(String[] args) {
        GenericStatic.someStaticMethod("hello");
        GenericStatic.someStaticMethod(123);
        GenericStatic.someStaticMethod(321.123);
    }
}
