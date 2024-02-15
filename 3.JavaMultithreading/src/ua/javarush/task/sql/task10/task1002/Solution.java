package ua.javarush.task.sql.task10.task1002;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
Метод uniqueResult
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі getDirector отримай сесію з MySessionFactory.getSessionFactory(). Напиши запит на hql для отримання Employee у якого smth = 'director'.
Результатом запиту очікується одне значення, поверни його у методі getDirector.

Requirements:
1. Метод getDirector повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод getDirector повинен повернути об'єкт Employee відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        //напишіть тут ваш код
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Employee where smth = 'director'");
        return (Employee) query.uniqueResult();
    }
}
