package ua.javarush.task.sql.task08.task0807;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* 
Налаштування HikariCP
У конструкторі HikariCPDataSource виконай налаштування HikariCP:

ініціалізуй поле config;

встанови полю config параметри підключення до БД: URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль;

ініціалізуй поле ds, передавши до конструктора поле config.

Requirements:
1. Конструктор HikariCPDataSource повинен ініціалізувати поле config згідно з умовою.
2. Конструктор HikariCPDataSource повинен ініціалізувати поле ds згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        try (Connection con = HikariCPDataSource.getConnection();
             PreparedStatement pst = con.prepareStatement("select * from employee");
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                employees.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("smth")));
            }
        }

        employees.forEach(System.out::println);
    }
}
