package ua.javarush.task.sql.task08.task0806;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/* 
Зчитування Java-об'єктів з БД
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.
Отримай усі рядки та колонки з таблиці employee.
Перетвори їх на об'єкти Employee і помісти їх до множини employees.

Закрий Statement та Connection.


Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у Connection повинен викликатися метод createStatement без параметрів.
3. Всі співробітники з БД повинні бути поміщені до статичної змінної працівників.
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String smth = resultSet.getString(4);

                Employee employee = new Employee(id, name, age, smth);
                employees.add(employee);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        employees.forEach(System.out::println);
    }
}
