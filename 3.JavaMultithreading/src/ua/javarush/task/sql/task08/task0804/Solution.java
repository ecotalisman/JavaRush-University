package ua.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* 
Batching запитів
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай PreparedStatement, використовуючи метод prepareStatement, передавши як параметр змінну sql.

У batch-режимі додай до таблиці п'ять записів:

('employee_0', 30, 'i = 0'),
('employee_1', 31, 'i = 1'),
...
('employee_4', 34, 'i = 4').
Закрий Statement та Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у Connection повинен викликатися метод prepareStatement відповідно до умови.
3. У методі main у PreparedStatement повинні викликатися методи setString, setInt, addBatch та executeBatch згідно з умовою.
4. До таблиці employee повинні додатись п'ять нових записів.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";
        //напишіть тут ваш код
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for (int i = 0; i < 5; i++) {
                preparedStatement.setString(1, "employee_" + i);
                preparedStatement.setInt(2, 30 + i);
                preparedStatement.setString(3, "i = " + i);
                preparedStatement.addBatch();
            }
            int[] results = preparedStatement.executeBatch();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
