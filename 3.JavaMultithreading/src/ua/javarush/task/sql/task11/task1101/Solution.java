package ua.javarush.task.sql.task11.task1101;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
Від'єднуємо об'єкт від сесії
Збережи створений об'єкт у базі даних (використовуй метод save) та привласни результат полю id1, від'єднай об'єкт
від сесії (використовуй метод evict) і знову за допомогою методу save збережи той самий об'єкт до БД із привласненням
результату полю id2 . Запусти програму та переконайся, що до від'єднання та після id об'єкта в БД різні (id1 == id2 повертає false ).

Requirements:
1. У методі main у об'єкта класу Session має бути викликаний метод save двічі з потрібним параметром.
2. У методі main у об'єкта класу Session має бути викликаний метод evict з потрібним параметром.
3. Після виконання коду програми значення полів id1 та id2 мають бути різні.
*/

public class Solution {
    public static long id1;
    public static long id2;

    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        animal.setName("Murka");
        animal.setAge(5);
        animal.setFamily("Cats");
        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            //напишіть тут ваш код
            id1 = (Long) session.save(animal);
            session.evict(animal);
            id2 = (Long) session.save(animal);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(id1 == id2);
    }
}
