package ua.javarush.task.sql.task13.task1303;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ua.javarush.task.sql.task13.task1303.entities.Publisher;

import java.util.List;

/* 
Знову книжки
Є три класи-ентіті: Author, Book і Publisher, та таблиці, які їм відповідають:

таблиця publisher з колонками id, name;
таблиця author з колонками id, first_name, last_name, full_name;
таблиця book з колонками id, title, author_id, publisher_id, publication_year, isbn.
Розстав анотації у класі Book перед полями author та publisher. Наразі вважаємо, що кожна книга може мати лише одного
автора і лише одного видавця.

У методі main отримай сесію з MySessionFactory.getSessionFactory(). Напиши hql-запит для отримання всіх видавців,
які публікували автора 'Mark Twain'.

Виведи в консолі назви отриманих видавців.

Requirements:
1. Метод main повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод main повинен виводити в консолі видавців відповідно до умови.
3. Поля, які посилаються на інші ентіті, повинні мати анотації JoinColumn з іменами колонок.
4. Поля, які посилаються на інші ентіті, повинні мати анотації ManyToOne.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Publisher> publishers;

        //напишіть тут ваш код
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query<Publisher> query = session.createQuery("select distinct b.publisher from Book b where b.author.fullName = :author_fullname", Publisher.class);
        query.setParameter("author_fullname", "Mark Twain");
        publishers = query.list();
        publishers.stream().map(Publisher::getName).forEach(System.out::println);
    }
}
