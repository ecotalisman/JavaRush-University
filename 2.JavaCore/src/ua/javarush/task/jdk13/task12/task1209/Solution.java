package ua.javarush.task.jdk13.task12.task1209;

/* 
Визначимося з тваринами
Напиши метод, який визначає, об'єкт якого класу йому передали, та повертає результат: одне зі значень — «Корова»,
«Кит», «Собака», «Невідома тварина».

Requirements:
1. Програма має виводити текст на екран.
2. У класі Solution має бути статичний клас Cow.
3. У класі Solution має бути статичний клас Dog.
4. У класі Solution має бути статичний клас Whale.
5. У класі Solution має бути статичний клас Pig.
6. Метод getObjectType() має повертати одне значення з: "Корова", "Кит", "Собака", "Невідома тварина" залежно від
об'єкта, який передали. Наприклад, "Корова" для об'єктів типу Solution.Cow.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишіть тут ваш код
        if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Dog) {
            return "Собака";
        } else if (o instanceof Whale) {
            return "Кит";
        } else {
            return "Невідома тварина";
        }
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
