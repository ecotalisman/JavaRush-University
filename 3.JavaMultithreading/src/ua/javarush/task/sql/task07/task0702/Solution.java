package ua.javarush.task.sql.task07.task0702;

import java.sql.*;

/* 
Виконання простого запиту
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.
За допомогою цього Statement виконай запит "select 7 * 8". Закрий Statement і Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У методі main за допомогою об'єкта Statement повинен виконуватись запит згідно з умовою.
4. Statement та Connection повинні бути закриті.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select 7 * 8");
        while (resultSet.next()) {
            Integer result = resultSet.getInt(1);
            System.out.println("Result: " + result);
        }
        statement.close();
        connection.close();
    }
}
