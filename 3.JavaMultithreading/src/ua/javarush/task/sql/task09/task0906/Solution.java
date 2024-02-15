package ua.javarush.task.sql.task09.task0906;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/* 
Налаштування SessionFactory
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

Додай метод main код для додаткового налаштування SessionFactory. Вкажи діалект "org.hibernate.dialect.MySQL8Dialect" і включи показ запитів, що виконуються SQL.

Requirements:
1. У конфігурації має бути зазначений діалект з умови завдання
2. У конфігурації має бути включений показ SQL запитів
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");

        //напишіть тут ваш код
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        properties.put(Environment.SHOW_SQL, "true");

        SessionFactory sessionFactory = new Configuration()
                .setProperties(properties)
                .buildSessionFactory();
    }
}
