package ua.javarush.task.sql.task08.task0805;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;

/* 
Збереження Java-об'єктів
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай PreparedStatement, використовуючи метод prepareStatement, передавши як параметр змінну sql.
Додай до таблиці всіх співробітників із безлічі employees.

Закрий Statement та Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у Connection повинен викликатися метод prepareStatement відповідно до умови.
3. До таблиці employee додадуться п'ять нових записів.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Set<Employee> employees = Set.of(
                new Employee("Vasya", 33, "lead"),
                new Employee("Pasha", 40, "dev"),
                new Employee("Sasha", 40, "lead"),
                new Employee("Dima", 40, "director"),
                new Employee("Sasha", 40, "dev"));
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             PreparedStatement statement = connection.prepareStatement(sql)) {
            //напишіть тут ваш код
            for (Employee employee : employees) {
                statement.setString(1, employee.getName());
                statement.setInt(2, employee.getAge());
                statement.setString(3, employee.getSmth());
                statement.addBatch();
            }
            statement.executeBatch();
        }
    }
}
