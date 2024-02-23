package ua.javarush.task.sql.task13.task1306;

import ua.javarush.task.sql.task13.task1306.entities.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Співавторство
Є два класи-ентіті: Author та Book. Таблиці, які відповідають їм:

таблиця author з колонками id, first_name, last_name, full_name;
таблиця book з колонками id, title, publication_year, isbn.
Так само є таблиця author_book, у якій зберігається інформація, які автори написали певні книги. У ній є колонки
author_id та book_id. Кожен автор може мати кілька книг, а кожна книга — кілька авторів.

Розставь анотації у класі Author перед полем books та у класі Book перед полем authors.

У методі main отримай сесію з MySessionFactory.getSessionFactory(). Виведи в консолі всіх співавторів 'Mark Twain'.
Уявімо, що в нашій базі є книги, у яких більше одного автора і один із них — Mark Twain.

Requirements:
1. Метод main повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод main повинен виводити в консолі співавторів згідно з умовою.
3. У полі books має бути анотація JoinTable з правильними параметрами.
4. У полі books має бути анотація ManyToMany.
5. У полі authors має бути анотація JoinTable з правильними параметрами.
6. У поля authors має бути анотація ManyToMany.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author where fullName = :AUTHOR_FULLNAME", Author.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            Author authorMarkTwain = query.getSingleResult();

            authorMarkTwain.getBooks()
                    .stream()
                    .flatMap(book -> book.getAuthors().stream())
                    .filter(author -> !authorMarkTwain.equals(author))
                    .distinct()
                    .map(Author::getFullName)
                    .forEach(System.out::println);
        }
    }
}
