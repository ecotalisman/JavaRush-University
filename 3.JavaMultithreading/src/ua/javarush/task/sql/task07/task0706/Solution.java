package ua.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
Ім'я і тип колонки
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Отримай Statement, використовуючи метод createStatement без параметрів. Виконай запит "select * from employee limit 1".
Для кожної колонки результату виведи в консолі назву колонки та у дужках — тип колонки.
Приклад виведення: id(INT) name(VARCHAR) age(INT) smth (VARCHAR) Закрий Statement і Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. У консолі мають бути виведені назви та типи всіх колонок згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee LIMIT 1");

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            String columnType = metaData.getColumnTypeName(i);
            System.out.println(columnName + "(" + columnType + ")");
        }
        statement.close();
        connection.close();
    }
}
