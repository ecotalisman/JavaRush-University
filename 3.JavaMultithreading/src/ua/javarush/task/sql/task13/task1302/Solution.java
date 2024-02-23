package ua.javarush.task.sql.task13.task1302;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Розміщення анотацій
Є клас-ентіті Author. Автор може мати досягнення achievements. Не всі досягнення однаково цінні, тому вони впорядковані
за допомогою achievement_index і зберігаються у списку List.

Додай анотації перед полем achievements у класі Author, щоб програма коректно обробляла дані з таблиць:

таблиця author з колонками id, first_name, last_name, full_name;
таблиця author_achievement з колонками author_id, achievement, achievement_index.

Requirements:
1. У поля achievements має бути анотація @ElementCollection.
2. У поля achievements має бути анотація @CollectionTable із зазначенням імені допоміжної таблиці та колонки з id автора.
3. У поля achievements має бути анотація @Column із зазначенням колонки з досягненням у допоміжній таблиці.
*/

public class Solution {

    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author", Author.class);
            List<Author> authors = query.list();

            authors.forEach(author -> {
                List<String> achievements = author.getAchievements();
                if (achievements.size() > 0) {
                    System.out.println(author.getFullName() + ":");
                    achievements.forEach(System.out::println);
                }
            });
        }
    }
}
