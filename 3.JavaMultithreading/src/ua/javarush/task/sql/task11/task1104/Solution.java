package ua.javarush.task.sql.task11.task1104;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
Видаляємо об'єкт з БД
Напиши код видалення об'єкта animalRemove за допомогою методу remove(). Запусти програму і переконайся,
що до видалення об'єкт не дорівнював null, а після видалення — дорівнює null.

Requirements:
1. У методі main у об'єкта класу Session має бути викликаний метод remove згідно з умовою.
2. Після роботи програми значення полів animalCat і animalMouse не повинні дорівнювати null, а значення animalRemove — дорівнює null.
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
            animalRemove = session.find(Animal.class, 1L);
            System.out.println(animalRemove == null);
            //напишіть тут ваш код
            session.remove(animalRemove);
            session.flush();
            session.clear();

            animalRemove = session.find(Animal.class, 1L);
            System.out.println(animalRemove == null);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}