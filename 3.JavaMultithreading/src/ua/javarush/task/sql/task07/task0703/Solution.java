package ua.javarush.task.sql.task07.task0703;

import java.sql.*;

/* 
Виконання запиту
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.
За допомогою цього Statement виконай запит до БД: отримай усі рядки та колонки з таблиці employee. Закрий Statement і Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У методі main за допомогою об'єкта Statement повинен виконуватися запит до БД згідно з умовою.
4. Statement та Connection повинні бути закриті.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        statement.close();
        connection.close();
    }
}
