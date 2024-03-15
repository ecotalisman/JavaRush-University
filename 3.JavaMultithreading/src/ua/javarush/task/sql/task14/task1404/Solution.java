package ua.javarush.task.sql.task14.task1404;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
JOIN FETCH
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

У методі getTasks отримай сесію з MySessionFactory.getSessionFactory().

Напиши запит на hql для отримання списку Task, відсортованого за deadline.

Об'єкти Task завантаж разом із дочірніми об'єктами, використовуючи для цього join fetch у hql запиті.

У результаті не повинно бути дублікатів. Метод getTasks повинен повернути отриманий список.

Requirements:
1. Метод getTasks повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод getTasks повинен повертати список Task відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Task> tasks = getTasks();
        tasks.forEach(System.out::println);
    }

    public static List<Task> getTasks() {
        //напишіть тут ваш код
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query<Task> query = session.createQuery("select distinct t from Task t left join fetch t.employees order by t.deadline", Task.class);
        List<Task> resultList = query.getResultList();
        return resultList;
    }
}
