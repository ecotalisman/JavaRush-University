package ua.javarush.task.sql.task08.task0803;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 
Використання PreparedStatement
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай PreparedStatement, використовуючи метод prepareStatement, передавши як параметр змінну sql.
Встанови запит на відповідні параметри, використовуючи змінні name, age та smth.

Виконай запит.
Закрий Statement та Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у Connection повинен викликатися метод prepareStatement відповідно до умови.
3. У методі main у PreparedStatement повинні викликатися методи setString, setInt та executeUpdate згідно з умовою.
4. До таблиці employee має додатися новий запис.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String name = "Harry";
        int age = 18;
        String smth = "Senior pomidor";
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, smth);

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
