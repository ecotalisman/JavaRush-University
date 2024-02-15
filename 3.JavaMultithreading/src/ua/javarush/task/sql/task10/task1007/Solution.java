package ua.javarush.task.sql.task10.task1007;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Метод setParameterList
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі getIn отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для отримання списку Employee у яких smth дорівнює одному з рядків зі списку in.
Employee повинні бути відсортовані за віком. Поверни отриманий список.

Requirements:
1. Метод getIn повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод getIn повинен повертати список Employee згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()){
            Query<Employee> query = session.createQuery("from Employee where smth in (:smth) order by age", Employee.class);
            query.setParameter("smth", in);
            return query.list();
        }
    }
}