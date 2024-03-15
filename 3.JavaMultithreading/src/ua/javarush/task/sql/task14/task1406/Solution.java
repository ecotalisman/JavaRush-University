package ua.javarush.task.sql.task14.task1406;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/* 
Кеш запитів
Для цього завдання тобі знадобиться додаткова залежність, яку можна завантажититут.
Додай цей jar-нік до модуля, а після здачі завдання видали залежність, щоб вона не впливала на інші завдання.
Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

Під час створення фабрики було активовано властивість SHOW_SQL: properties.put(Environment.SHOW_SQL, true);
Завдяки цьому в консолі логуватимуться всі реальні звернення до бази даних.
Під час запуску методу main в консолі отримаєш один рядок із запитом, що відповідає одному зверненню до БД.

Другого звернення не відбувається, оскільки увімкнено кеш запитів. У методі clearCache очисти кеш,
щоб в результаті запуску main у консолі відобразилося два запити до БД.

Requirements:
1. Зміни повинні бути внесені лише до метода clearCache.
2. У методі clearCache має відбуватися очищення кеша у фабрики factory.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Employee director1;
        Employee director2;

        try (SessionFactory sessionFactory = MySessionFactory.getSessionFactory()) {
            try (Session session = sessionFactory.openSession()) {
                Query<Employee> query1 = session.createQuery("from Employee where smth = 'director'", Employee.class);
                query1.setCacheable(true);
                director1 = query1.uniqueResult();
            }

            clearCache(sessionFactory);

            try (Session session = sessionFactory.openSession()) {
                Query<Employee> query2 = session.createQuery("from Employee where smth = 'director'", Employee.class);
                query2.setCacheable(true);
                director2 = query2.uniqueResult();
            }

            System.out.println(director1);
            System.out.println(director2);
        }
    }

    public static void clearCache(SessionFactory factory) {
        //напишіть тут ваш код
        factory.getCache().evictAllRegions();
    }
}
