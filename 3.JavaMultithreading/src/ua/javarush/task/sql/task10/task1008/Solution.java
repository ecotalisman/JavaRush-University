package ua.javarush.task.sql.task10.task1008;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
setFirstResult і setMaxResults
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі getSorted отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для отримання списку Employee, відсортованих за віком. Запит повинен повернути limit Employee починаючи з offset.
Метод getSorted повинен повернути отриманий список.

Requirements:
1. Метод getSorted повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод getSorted повинен повертати список Employee згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getSorted(3, 5).forEach(System.out::println);
    }

    public static List<Employee> getSorted(int offset, int limit) {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("from Employee order by age", Employee.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.list();
        }
    }
}
