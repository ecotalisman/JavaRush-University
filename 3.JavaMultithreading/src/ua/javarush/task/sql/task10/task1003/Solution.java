package ua.javarush.task.sql.task10.task1003;

/*
Метод executeUpdate
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі promoteAll отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для додавання 'senior' на початок поточного значення колонки smth для всіх співробітників.
Наприклад, якщо значення smth було 'admin', то має стати 'senior admin'.

Requirements:
1. Метод promoteAll повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод promoteAll повинен внести зміни до колонки smth для всіх співробітників відповідно до умови.
*/

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("update Employee set smth = concat('senior ', smth)");
            query.executeUpdate();
            transaction.commit();
        }
    }
}
