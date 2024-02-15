package ua.javarush.task.sql.task10.task1010;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.List;

/* 
NativeQuery
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі getAll отримай сесію з MySessionFactory.getSessionFactory().
За допомогою сесії створи NativeQuery для отримання всіх Employee з таблиці employee у порядку зростання id. Метод getAll повинен повернути отриманий список.

Requirements:
1. Метод getAll повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод getAll повинен викликати у сесії метод createQuery і не викликати метод createQuery.
3. Метод getAll повинен повертати список Employee згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getAll().forEach(System.out::println);
    }

    public static List<Employee> getAll() {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            NativeQuery<Employee> nativeQuery = session.createNativeQuery("SELECT * FROM Employee ORDER BY id ASC", Employee.class);
            return nativeQuery.list();
        }
    }
}