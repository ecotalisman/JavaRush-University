package ua.javarush.task.sql.task12.task1203;

/* 
Зберігаємо об'єкт до БД
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

Додати до публічного класу TimeClass приватні поля id (Long), instant (Instant) та zonedDateTime (ZonedDateTime).
У класу TimeClass повинні бути анотації @Entity та @Table (ім'я таблиці time_table , Схема — test).
У всіх полях повинні бути присутні геттери та сеттери.
У всіх полях повинні бути відповідні анотації.
У поля id має бути анотація @Id.
У поля instant має бути анотація @Column, в якій зазначено ім'я колонки "instant".
У поля zonedDateTime має бути анотація @Basic та анотація @Column, в якій вказано ім'я колонки "zoned_time".

У методі main класу Solution треба створити об'єкт класу TimeClass, і за допомогою сеттерів встановити значення для id,
Instant та ZonedDateTime.
Для сеттера id використовуй будь-яке значення.
Для сеттера Instant використовуй статичний метод ofEpochSecond з будь-яким значенням.
Для сеттера ZonedDateTime використовуй статичний метод now, якому треба передати статичний метод systemDefault
класу ZoneId.
Використовуючи метод getSessionFactory, у методі main слід розпочати транзакцію, зберегти об'єкт класу TimeClass і
зробити коміт.
Для виконання завдання тобі потрібно локально запустити сервер (localhost:3306) і створити базу даних із потрібною схемою,
таблицею та колонками.

Requirements:
1. Клас TimeClass має бути публічним і містити три приватні поля.
2. У класі TimeClass біля полів повинні бути публічні геттери та сеттери.
3. У класі TimeClass анотації рівня класу мають бути розставлені відповідно до умов.
4. У класі TimeClass анотації рівня поля мають бути розставлені відповідно до умов.
5. Не змінюй метод getSessionFactory у класі Solution.
6. У методі main класу Solution використовуй сеттери класу TimeClass згідно з умовами.
7. У методі main класу Solution збережи об'єкт класу TimeClass до бази даних відповідно до умов.
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        TimeClass timeClass = new TimeClass();
        timeClass.setId(1L);
        timeClass.setInstant(Instant.ofEpochSecond(10_000_000));
        timeClass.setZonedDateTime(ZonedDateTime.now(ZoneId.systemDefault()));
        Session currentSession = getSessionFactory().openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(timeClass);
        transaction.commit();
    }

    public static SessionFactory getSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");

        SessionFactory sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(TimeClass.class)
                .buildSessionFactory();

        return sessionFactory;
    }
}
