package ua.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
join в HQL
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити, ти не зможеш локально виконувати код.

У методі main отримай сесію з MySessionFactory.getSessionFactory().
Напиши запит на hql для отримання книг з таблиці book, у яких full_name автора 'Mark Twain' та name видавця 'Chatto & Windus'.
Отримані книги виведи в консолі.

Requirements:
1. Метод main повинен відкривати сесію за допомогою SessionFactory, що повертається методом getSessionFactory.
2. Метод main повинен виводити в консолі книги згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;
        //напишіть тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Book> query = session.createQuery("from Book where author.fullName = 'Mark Twain' and  publisher.name = 'Chatto & Windus'", Book.class);
            books = query.list();
        }
        books.forEach(System.out::println);
    }
}
