package ua.javarush.task.jdk13.task34.task3409;

/* 
Перший ліпший конструктор
Розберися з поточними класами. Метод newInstance об'єкту Generator має повертати об'єкт того класу, який він отримав у
конструкторі, втім зараз під час запуску виникає виняток. Виправ метод newInstance таким чином, щоб конструкція стала робочою.

Requirements:
1. Клас Generator має бути параметризовано типом Т.
2. Клас Generator повинен мати поле типу Class, яке параметризоване типом Т.
3. Клас Generator повинен мати конструктор, який ініціалізує поле типу Class.
4. Метод newInstance у класі Generator повинен створювати і повертати об'єкт типу Т.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance());
        System.out.println(eventGenerator.newInstance());
        System.out.println(eventGenerator.newInstance());
        System.out.println(new Generator<>(Solution.class).newInstance());
        System.out.println(new Generator<>(NullPointerException.class).newInstance());
    }
}

/**
 * розберемося.
 *
 * 1) Цей код спробує створити об'єкт, використовуючи конструктор за замовчуванням (тобто конструктор без параметрів).
 * Однак, якщо клас не має конструктора за замовчуванням, код викидає виняток NoSuchMethodException.
 * 1. Метод спробує знайти конструктор без параметрів за допомогою getDeclaredConstructor().
 * 2. setAccessible(true) дозволяє вам створювати об'єкти навіть з не публічних конструкторів.
 * 3. Якщо конструктор без параметрів не знайдений, викидається виняток.
 *
 * T newInstance() throws Exception {
 *     try {
 *         Constructor<T> defaultConstructor = aClass.getDeclaredConstructor(); // Спроба знайти конструктор за замовчуванням
 *         defaultConstructor.setAccessible(true); // Це забезпечує доступ до конструктора незалежно від його модифікатора (private, protected тощо)
 *         return defaultConstructor.newInstance(); // Створюємо новий екземпляр об'єкту
 *     } catch (NoSuchMethodException e) {
 *         throw new Exception("No default constructor found", e); // Якщо конструктора за замовчуванням немає, кидаємо виняток
 *     }
 * }
 *
 * 2) У "вірному" коді:
 *
 * Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
 * return declaredConstructor.newInstance(new Object[declaredConstructor.getParameterCount()]);
 *
 * Тут ви берете перший доступний конструктор класу (це може бути будь-який конструктор, не обов'язково за замовчуванням)
 * і потім створюєте новий екземпляр цього класу, передавши масив об'єктів в якості параметрів.
 *
 * Метод getParameterCount() повертає кількість параметрів конструктора.
 * Масив new Object[declaredConstructor.getParameterCount()]
 *
 * створює масив об'єктів потрібного розміру, але всі його елементи будуть null. Тобто, якщо конструктор вимагає параметри,
 * ви передаєте їм null.
 *
 * Таким чином, цей підхід може працювати тільки тоді, коли:
 *
 * Конструктор може приймати null як дійсне значення для всіх своїх параметрів.
 * Якщо перший доступний конструктор є конструктором за замовчуванням, ви передаєте масив з розміром 0, що фактично
 * еквівалентно виклику конструктора без параметрів.
 * Цей підхід більш гнучкий, але його слабка сторона в тому, що він може не працювати належним чином для класів
 * з конструкторами, які не можуть приймати null.
 *
 * */