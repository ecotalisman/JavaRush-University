package ua.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
Використання результату запиту 2
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.
Виведи в консолі мінімальне значення колонки age таблиці employee. Тип колонки — INT. Закрийте Statement і Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У консолі слід вивести мінімальне значення колонки age.
4. Statement та Connection повинні бути закриті.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT MIN(age) AS minAge FROM employee");
        while (resultSet.next()) {
            Integer minAge = resultSet.getInt("minAge");
            System.out.println(minAge);
        }
        statement.close();
        connection.close();
    }
}
