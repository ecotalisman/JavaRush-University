package ua.javarush.task.sql.task07.task0709;

import java.sql.*;
import java.util.Date;

/* 
Метод getObject
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів.

Виведи в консолі значення колонок name (VARCHAR), weight (FLOAT), birthday (DATE) та inn (LONG) з таблиці employee, розділені пробілом.

Приклад виведення:
Pasha 73.7 null 2222222222
Nastya null 1997-07-17 null

Закрий Statement та Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У консолі повинні бути виведені значення колонок name, weight, birthday та inn згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, weight, birthday, inn FROM employee");

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            Float weight = resultSet.getObject("weight", Float.class);
            Date birthday = resultSet.getDate("birthday");
            Long inn = resultSet.getObject("inn", Long.class);
            System.out.println(name + " " + weight + " " + birthday + " " + inn);
        }
        statement.close();
        connection.close();
    }
}
