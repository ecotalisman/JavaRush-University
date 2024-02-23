package ua.javarush.task.sql.task13.task1301;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Set;

/* 
Розміщення анотацій
Є клас-ентіті Author. Автор може мати статті articles. Додай анотації перед полем articles у класі Author,
щоб програма коректно обробляла дані з таблиць:

таблиця author з колонками id, first_name, last_name, full_name;
таблиця author_article з колонками author_id, article.

Requirements:
1. У поля articles має бути анотація @ElementCollection.
2. У поля articles має бути анотація @CollectionTable із зазначенням імені допоміжної таблиці та колонки з id автора.
3. У полі articles повинна бути анотація @Column із зазначенням колонки зі статтею у допоміжній таблиці.
*/

public class Solution {

    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author", Author.class);
            List<Author> authors = query.list();

            authors.forEach(author -> {
                Set<String> articles = author.getArticles();
                if (articles.size() > 0) {
                    System.out.println(author.getFullName() + ":");
                    articles.forEach(System.out::println);
                }
            });
        }
    }
}
