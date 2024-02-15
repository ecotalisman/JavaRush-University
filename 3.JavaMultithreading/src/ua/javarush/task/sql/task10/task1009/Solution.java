package ua.javarush.task.sql.task10.task1009;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Функції в HQL
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі getSalaryFund отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для отримання суми значень колонки salary.
Метод getSalaryFund повинен повернути суму.

У методі getAverageAge отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для отримання середнього значення колонки age.
Метод getAverageAge повинен повернути середнє значення.

Requirements:
1. Методи getSalaryFund і getAverageAge повинні відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Методи getSalaryFund та getAverageAge повинні повертати числа відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("select sum(salary) from Employee", Long.class);
            return query.uniqueResult();
        }
    }

    public static Double getAverageAge() {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Double> query = session.createQuery("select avg(age) from Employee", Double.class);
            return query.uniqueResult();
        }
    }
}
