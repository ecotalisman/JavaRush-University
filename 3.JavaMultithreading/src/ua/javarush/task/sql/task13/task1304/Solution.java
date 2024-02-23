package ua.javarush.task.sql.task13.task1304;

/*
Автор книги чи книга автора?
Є три класи-ентіті: Author, Book та Publisher, та таблиці, які їм відповідають:

таблиця publisher з колонками id, name;
таблиця author з колонками id, first_name, last_name, full_name;
таблиця book з колонками id, title, author_id, publisher_id, publication_year, isbn.
Розстав інструкції у класі Author перед полем books.

У методі main отримай сесію з MySessionFactory.getSessionFactory(). Напиши hql-запит для отримання автора з повним ім'ям 'Mark Twain'.

Виведи в консолі всі його книги.

Requirements:
1. Метод main повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод main повинен виводити в консолі книги автора відповідно до умови.
3. У полі books має бути анотація JoinColumn з ім'ям колонки з таблиці book.
4. У полі books має бути анотація OneToMany.
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ua.javarush.task.sql.task13.task1304.entities.Author;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query<Author> query = session.createQuery("from Author a where a.fullName = :fullName", Author.class);
        query.setParameter("fullName", "Mark Twain");
        Author author = query.uniqueResult();
        author.getBooks().forEach(System.out::println);
    }
}
