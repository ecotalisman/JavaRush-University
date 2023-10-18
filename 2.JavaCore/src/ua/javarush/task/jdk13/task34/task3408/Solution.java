package ua.javarush.task.jdk13.task34.task3408;

/* 
Генератор об'єктів
Розберися з поточними класами. Метод newInstance класу Generator повинен створювати і повертати Event для кожного нового
виклику, втім зараз він повертає null. Перероби клас Generator таким чином, щоб конструкція стала робочою.

Requirements:
1. Клас Generator має бути параметризований типом Т.
2. Клас Generator повинен мати поле типу Class, яке параметризоване типом Т.
3. Клас Generator повинен мати конструктор, який ініціалізує поле типу Class.
4. Метод newInstance у класі Generator повинен створювати та повертати об'єкт типу Т.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
    }
}

/**
 * Generator<Event> eventGenerator
 * Це створює змінну eventGenerator типу Generator<Event>. Це означає, що eventGenerator є змінною, яка може посилатися
 * на об'єкти типу Generator, які працюють із типом Event.
 *
 * new Generator<>(Event.class)
 * Тут відбувається кілька дій:
 *
 * 1. new Generator<>(): Це створює новий екземпляр класу Generator. Ви вказуєте тип Event для цього екземпляра, але
 * завдяки "diamond operator" (<>) ви можете опустити цей тип під час створення екземпляра, і Java автоматично визначить
 * потрібний тип на основі контексту.
 *
 * 2. (Event.class): Це аргумент, який передається в конструктор класу Generator. Event.class є так званим "класовим
 * об'єктом" для класу Event. В Java, кожен клас має такий об'єкт, який представляє його метадані на рівні виконання (runtime).
 *
 * Отже, коли ви викликаєте new Generator<>(Event.class), ви створюєте новий об'єкт Generator, який "знає", як
 * створювати об'єкти класу Event, завдяки переданому класовому об'єкту Event.class.
 *
 * В результаті, eventGenerator буде змінною, яка може створювати нові екземпляри класу Event через свій метод newInstance().
 * */
