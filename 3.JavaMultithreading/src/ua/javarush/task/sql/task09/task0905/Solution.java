package ua.javarush.task.sql.task09.task0905;

/* 
Додавання та видалення записів
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

Реалізуй методи додавання та видалення тварини з бази. Кожен метод повинен відкривати сесію, розпочинати транзакцію,
виконувати необхідні дії, закривати (комітити) транзакцію та закривати сесію.

Requirements:
1. Метод addAnimal повинен відкривати сесію (openSession) за допомогою sessionFactory.
2. Метод removeAnimal повинен відкривати сесію (openSession) за допомогою sessionFactory.
3. Метод addAnimal повинен починати транзакцію.
4. Метод removeAnimal повинен починати транзакцію.
5. Метод addAnimal має зберігати передану тварину в базу.
6. Метод removeAnimal повинен видаляти передану тварини з бази.
7. Метод addAnimal повинен закривати розпочату транзацію.
8. Метод removeAnimal повинен закривати розпочату транзацію.
9. Метод addAnimal повинен закривати відкриту сесію.
10. Метод removeAnimal повинен закривати відкриту сесію.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        AnimalManager animalManager = new AnimalManager();

        System.out.println("All animals:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal.getName());
        }

        Animal dog = new Animal();
        dog.setName("Dina");
        dog.setAge(2);
        dog.setFamily("Dog");

        animalManager.addAnimal(dog);

        System.out.println("All animals, after adding a new one:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal.getName());
        }

        animalManager.removeAnimal(dog);

        System.out.println("All animals, after removing the new one:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal.getName());
        }
    }
}
