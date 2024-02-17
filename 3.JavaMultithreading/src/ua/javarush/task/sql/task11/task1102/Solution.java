package ua.javarush.task.sql.task11.task1102;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
Збережи або онови
Збережи об'єкт animalCat у базі даних за допомогою методу save об'єкта session, потім виклич метод saveOrUpdate
для об'єктів animalCat та animalDog. Запусти програму і переконайся, що в БД міститься лише два записи
(метод saveOrUpdate для об'єкта animalDog відпрацював як save, а для об'єкта animalCat — як update).

Requirements:
1. У методі main у об'єкта класу Session має бути викликаний метод save з потрібним параметром.
2. У методі main у об'єкта класу Session повинен бути викликаний метод saveOrUpdate для двох різних об'єктів.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Animal animalCat = new Animal();
        animalCat.setName("Murka");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");

        Animal animalDog = new Animal();
        animalDog.setName("Barsik");
        animalDog.setAge(3);
        animalDog.setFamily("Dogs");

        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            //напишіть тут ваш код
            session.save(animalCat);
            session.saveOrUpdate(animalCat);
            session.saveOrUpdate(animalDog);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
