package ua.javarush.task.sql.task16.task1601;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/* 
Знайомство з Criteria API
За допомогою Criteria API напиши запит, який вибере всі записи з таблиці animal_table.

Requirements:
1. У методі main у об'єкта класу Session має бути викликаний метод getCriteriaBuilder.
2. У методі main у об'єкта класу CriteriaBuilder має бути викликаний метод createQuery з потрібним параметром.
3. У методі main у об'єкта класу CriteriaQuery повинні бути викликані методи select та from з потрібними параметрами.
4. У методі main у об'єкта класу Session має бути викликаний метод createQuery з потрібним параметром.
5. У методі main у об'єкта класу Query має бути викликаний метод getResultList.
6. У результаті роботи програми на екран має бути виведено список об'єктів згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Animal> results = new ArrayList<>();
        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(new Animal("Tom", 5, "Cat"));
            session.saveOrUpdate(new Animal("Jerry", 3, "Mouse"));
            session.saveOrUpdate(new Animal("Spike", 7, null));
            transaction.commit();
            //напишіть тут ваш код
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Animal> critQuery = builder.createQuery(Animal.class);
            critQuery.select(critQuery.from(Animal.class));

            results = session.createQuery(critQuery).getResultList();

            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        results.forEach(System.out::println);
    }
}