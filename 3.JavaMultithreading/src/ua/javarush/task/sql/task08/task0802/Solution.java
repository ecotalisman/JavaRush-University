package ua.javarush.task.sql.task08.task0802;

import java.sql.*;

/* 
Відкочування транзакції
У методі main створи підключення до БД за допомогою методу getConnection(String, String, String) класу DriverManager.
Використовуй URL "jdbc:mysql://localhost:3306/test", користувача "root" і такий самий пароль.
Вимкни AutoCommit.
Отримай Statement, використовуючи метод createStatement без параметрів.

Співробітнику (таблиця employee) з полем name, що дорівнює Diego, збільш значення salary на 2000.

Співробітнику (таблиця employee) з полем name, що дорівнює Amigo, збільш значення salary на 500.
Виконай commit.

Огорни код у блок try-catch, і в catch виклич rollback у підключення.
Закрий Statement та Connection.

Requirements:
1. У методі main має створюватись підключення до БД та відключатися AutoCommit згідно з умовою.
2. У методі main у підключення повинен викликатися метод createStatement без параметрів.
3. До бази даних має бути внесено дві зміни та виконано коміт згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        Statement statement = connection.createStatement();
        try {
            connection.setAutoCommit(false);
            int salary = statement.executeUpdate("UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego'");
            int salary2 = statement.executeUpdate("UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'");
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
        }
        connection.close();
        statement.close();
    }
}
