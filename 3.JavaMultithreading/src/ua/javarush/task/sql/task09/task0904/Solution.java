package ua.javarush.task.sql.task09.task0904;

import java.util.List;

/* 
Всі імена
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

Додай до методу getAllAnimals код для створення (відкриття) сесії та отримання всіх тварин з бази даних.
Не забудь закрити сесію після завершення роботи з нею або виникнення виключення.

Requirements:
1. У методі getAllAnimals повинна відкриватися сесія (openSession) за допомогою sessionFactory
2. Метод getAllAnimals повинен виконувати запит для отримання всіх тварин
3. Метод main повинен виводити імена всіх тварин на екран
4. У методі getAllAnimals необхідно закрити відкриту сесію
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        AnimalManager animalManager = new AnimalManager();
        List<Animal> animals = animalManager.getAllAnimals();

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
