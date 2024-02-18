package ua.javarush.task.sql.task11.task1105;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
Видаляємо об'єкт із БД за допомогою HQL
Напиши код видалення об'єкта типу Animal з id=2 за допомогою HQL. Використовуй методи createQuery() та executeUpdate().

Не використовуй інші методи об'єкта типу Query. Запусти програму та переконайся, що в таблиці є лише один запис (з id = 1).

Requirements:
1. У методі main у об'єкта класу Session має бути викликаний метод createQuery, а в отриманого об'єкта типу Query метод executeUpdate.
2. Після роботи програми в таблиці має бути лише один запис (c id = 1).
*/

public class Solution {
    public static Animal animalCat = new Animal();
    public static Animal animalMouse = new Animal();
    public static Animal animalRemove;

    public static void main(String[] args) throws Exception {
        animalCat.setId(1L);
        animalCat.setName("Tom");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");

        animalMouse.setId(2L);
        animalMouse.setName("Jerry");
        animalMouse.setAge(3);
        animalMouse.setFamily("Mice");

        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(animalCat);
            session.persist(animalMouse);
            //напишіть тут ваш код
            session.createQuery("delete from Animal where id = 2")
                    .executeUpdate();

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
