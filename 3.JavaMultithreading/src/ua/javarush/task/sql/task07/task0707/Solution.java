package ua.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.

Виведи в консолі значення колонок name (VARCHAR) та weight (FLOAT) з таблиці employee, розділені пробілом.

Приклад виведення:
Vasya 73.3
Pasha 0.0
Sasha 40.2
Dima null
Sasha null

Закрий Statement та Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У консолі мають бути виведені значення колонок name та weight згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, weight FROM employee");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            float weight = resultSet.getFloat("weight");
            if (resultSet.wasNull()) {
                System.out.println(name + " null");
            } else {
                System.out.println(name + " " + weight);
            }
        }
        statement.close();
        connection.close();
    }
}
