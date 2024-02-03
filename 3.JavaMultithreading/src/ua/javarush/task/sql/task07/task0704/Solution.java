package ua.javarush.task.sql.task07.task0704;

import java.sql.*;

/* 
Використання результату запиту 1
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.
За допомогою цього Statement виконай запит до БД: отримай усі рядки та колонки з таблиці employee.
Виведи в консолі значення колонки name, кожне значення з нового рядка. Тип колонки — рядок. Закрий Statement і Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У методі main за допомогою об'єкта Statement повинен виконуватися запит до БД згідно з умовою.
4. У консолі слід вивести значення колонки name.
5. Statement та Connection повинні бути закриті.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }
        statement.close();
        connection.close();
    }
}
