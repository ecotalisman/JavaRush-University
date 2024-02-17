package ua.javarush.task.sql.task11.task1103;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
Дістаємо неіснуючий об'єкт з БД
Спробуй дістати з БД об'єкт класу Animal з id + 1. Використовуй методи get(), load() та find() об'єкта session.
Результат запиши в поля animalGet, animalLoad та animalFind відповідно. Запусти програму та переконайся,
що значення полів animalGet та animalFind дорівнюють null, а значення animalLoad не дорівнює null.

Requirements:
1. У методі main у об'єкта класу Session має бути викликаний метод get з параметрами Animal.class та id+1.
2. У методі main у об'єкта класу Session має бути викликаний метод load з параметрами Animal.class та id+1.
3. У методі main у об'єкта класу Session має бути викликаний метод find із параметрами Animal.class та id+1.
4. Після роботи програми значення полів animalGet і animalFind повинні дорівнювати null, а значення animalLoad — не дорівати null.
*/

public class Solution {
    public static Animal animalGet;
    public static Animal animalLoad;
    public static Animal animalFind;

    public static void main(String[] args) throws Exception {
        Animal animalCat = new Animal();
        animalCat.setName("Murka");
        animalCat.setAge(5);
        animalCat.setFamily("Cats");

        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            long id = (long) session.save(animalCat);
            //напишіть тут ваш код
            animalGet = session.get(Animal.class, id + 1);
            animalLoad = session.load(Animal.class, id + 1);
            animalFind = session.find(Animal.class, id + 1);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(animalGet == null);
        System.out.println(animalLoad != null);
        System.out.println(animalFind == null);
    }
}
