package ua.javarush.task.pro.task12.task1220;

import java.util.ArrayList;

/* 
Мисливці за привидом: у гонитві за типами
У методі main створюється список, заповнюється різними об'єктами й передається в метод checkElementsType(ArrayList<Object>).
Твоє завдання — реалізувати цей метод, який має визначити тип кожного елемента списку, а також:

Для типу String викликати printString();
Для типу Integer викликати printInteger();
Для типу Integer[] викликати printIntegerArray();
Для решти типів викликати printUnknown().
Метод main у перевірці не використовується.

Requirements:
1. Не змінювати оголошення й реалізацію методу printString(String).
2. Не змінювати оголошення й реалізацію методу printInteger(Integer).
3. Не змінювати оголошення й реалізацію методу printIntegerArray(Integer[]).
4. Не змінювати оголошення й реалізацію методу printUnknown(Object).
5. Метод checkElementsType(ArrayList<Object>) має працювати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привіт");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //напишіть тут ваш код
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) instanceof String) {
                printString();
            } else if (elements.get(i) instanceof Integer) {
                printInteger();
            } else if (elements.get(i) instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Рядок");
    }

    public static void printInteger() {
        System.out.println("Ціле число");
    }

    public static void printIntegerArray() {
        System.out.println("Масив цілих чисел");
    }

    public static void printUnknown() {
        System.out.println("Інший тип даних");
    }
}

/*

Оператор instanceof використовується для перевірки, чи є об'єкт екземпляром певного класу або підкласу, або чи є об'єкт
екземпляром класу, який реалізує певний інтерфейс.

Ось як працює оператор instanceof:

Перевіряє, чи є змінна об'єкта належною до певного класу або підкласу, або чи реалізує вона певний інтерфейс.
Повертає true, якщо об'єкт є екземпляром відповідного класу, підкласу або реалізує інтерфейс. В іншому випадку,
повертає false.

Детальний приклад:

class Animal {
}

class Dog extends Animal {
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(animal instanceof Animal); // true, тому що animal є екземпляром класу Animal
        System.out.println(dog instanceof Animal);    // true, тому що dog є екземпляром класу Dog, який є підкласом Animal
        System.out.println(animal instanceof Dog);    // false, тому що animal не є екземпляром класу Dog
    }
}
У вашому випадку, оператор instanceof використовується для перевірки типу елемента в списку:


if (elements.get(i) instanceof String) {
    printString();
} else if (elements.get(i) instanceof Integer) {
    printInteger();
} else if (elements.get(i) instanceof Integer[]) {
    printIntegerArray();
} else {
    printUnknown();
}

Тут для кожного елемента списку перевіряється, до якого типу він належить, і викликається відповідний метод для виведення результату.

*/