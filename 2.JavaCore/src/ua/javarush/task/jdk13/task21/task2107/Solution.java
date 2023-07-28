package ua.javarush.task.jdk13.task21.task2107;

/*
AutoCloseable і try-with-resources
У класі FakeConnection реалізуй інтерфейс AutoCloseable, щоб об'єкти цього типу можна було використовувати
у try-with-resources.
Метод close() має виводити на екран фразу "Closing database connection..."
У блоці try послідовно викличи методи usefulOperation() та unsupportedOperation().

Виведення на екран повинне бути таким:
Establishing database connection...
Entering body of try block.
Executing useful operation.
Operation is not supported yet!
Closing database connection...

Зверни увагу, що ресурси звільнилися автоматично, незважаючи на виняток, що кинуто методом unsupportedOperation.

Requirements:
1. Клас FakeConnection повинен підтримувати інтерфейс AutoCloseable.
2. Метод close класу FakeConnection має виводити на екран фразу "Closing database connection...".
3. У методі main класу Solution потрібно викликати методи usefulOperation та unsupportedOperation в об'єкту класу FakeConnection.
4. Виведення на екран має бути відповідним до того, що вказане в умові завдання.
5. Метод close класу FakeConnection не повинен викликатися явно.
*/

public class Solution {
    public static void main(String[] args) {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
            System.out.println("Entering body of try block.");

            // Add code here:
            fakeConnection.usefulOperation();
            fakeConnection.unsupportedOperation();
        } catch (Exception ignore) {
        }
    }
}


/*

Інтерфейс AutoCloseable використовується в Java для автоматичного закриття ресурсів, які були відкриті в межах
блоку try-with-resources.

Ось базовий опис цього інтерфейсу:

public interface AutoCloseable {
    void close() throws Exception;
}

Класи, які реалізують цей інтерфейс, мають визначити метод close(), який буде викликаний автоматично при виході
з блоку try-with-resources, незалежно від того, чи виник виняток чи ні.

У вашому коді, клас FakeConnection реалізує інтерфейс AutoCloseable. Це означає, що об'єкт FakeConnection можна
використовувати в межах блоку try-with-resources, і його метод close() буде викликаний автоматично при виході з цього блоку.

try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
    // Використання об'єкту fakeConnection
} // Метод fakeConnection.close() викликається автоматично тут

Ця властивість особливо корисна при роботі з ресурсами, які вимагають закриття, такими як потоки вводу-виводу,
з'єднання з базою даних тощо. Вона забезпечує, що ресурси завжди будуть відповідно закриті, щоб уникнути витоку ресурсів.

*/