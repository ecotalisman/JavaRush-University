package ua.javarush.task.sql.task09.task0903;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/* 
Configuration
Якщо раніше не підключав залежності, то підключи їх. Для цього натисни Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

Додай до методу main код для конфігурування SessionFactory. У конфігурації вкажи entity-клас Animal.
Під час конфігурування як драйвер необхідно використовувати "com.mysql.jdbc.Driver", URL "jdbc:mysql://localhost:3306 /test",
діалект "org.hibernate.dialect.MySQLDialect", користувача "root" і такий самий пароль.

Requirements:
1. У методі main повинен створюватись об'єкт класу Properties.
2. До об'єкта класу Properties повинні додаватися параметри, перелічені в умови завдання.
3. У методі main повинен створюватись об'єкт класу Configuration.
4. У об'єкта класу Configuration повинен бути викликаний метод setProperties із правильним параметром.
5. У об'єкта класу Configuration повинен бути викликаний метод addAnnotatedClass із правильним параметром.
6. У методі main повинен бути створений об'єкт класу SessionFactory за допомогою методу buildSessionFactory конфігурації.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");

        SessionFactory sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Animal.class)
                .buildSessionFactory();
    }
}