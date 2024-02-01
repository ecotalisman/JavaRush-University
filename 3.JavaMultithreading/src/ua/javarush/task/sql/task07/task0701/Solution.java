package ua.javarush.task.sql.task07.task0701;

import java.sql.*;

/* 
Встановлення підключення
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль. Закрий Connection.

Requirements:
1. У методі main має створюватися підключення до БД відповідно до умови.
2. Підключення має бути закритим.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        connection.close();
    }
}
