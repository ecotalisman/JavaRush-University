package ua.javarush.task.sql.task10.task1001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/*
Метод list

Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі main отримай сесію з MySessionFactory.getSessionFactory(). Напиши запит на hql для отримання колонки smth із таблиці employee.
Відфільтруй значення age > 18, відсортуй за smth і прибери дублікати.
Виведи значення в консоль, кожне з нового рядка.

Requirements:
1. Метод main повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод main повинен виводити в консолі дані колонки smth згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query<String> query = session.createQuery("select distinct smth from Employee where age > 18 group by smth", String.class);
        query.getResultList().forEach(System.out::println);
    }
}