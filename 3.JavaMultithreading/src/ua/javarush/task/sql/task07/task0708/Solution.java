package ua.javarush.task.sql.task07.task0708;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Отримання дати
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.

Виведи в консолі значення колонок name (VARCHAR) і created (TIMESTAMP) з таблиці employee, розділені пробілом.
Значення колонки створено у вигляді LocalDateTime.

Приклад виведення:
Vasya 2020-01-01T10:10:10
Pasha 2019-12-31T23:40:10

Закрий Statement та Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У консолі повинні бути виведені значення колонок name і створені відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, created FROM employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            Timestamp createdTimestamp = resultSet.getTimestamp("created");
            LocalDateTime created = createdTimestamp != null ? createdTimestamp.toLocalDateTime() : null;
            System.out.println(name + " " + (created != null ? created.toString() : "null"));
        }
        statement.close();
        connection.close();
    }
}
