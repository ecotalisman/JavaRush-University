package ua.javarush.task.sql.task10.task1006;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Параметри до запитів
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі getBetween отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для отримання списку Employee, у яких вік більший за параметр from, але менший за параметр to.
Employee повинні бути відсортовані за віком. Поверни отриманий список.

Requirements:
1. Метод getBetween повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод getBetween повинен повертати список Employee згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getBetween(25, 32).forEach(System.out::println);
    }

    public static List<Employee> getBetween(int from, int to) {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("from Employee where age > :from and age < :to order by age", Employee.class);
            query.setParameter("from", from);
            query.setParameter("to", to);
            return query.list();
        }
    }
}
