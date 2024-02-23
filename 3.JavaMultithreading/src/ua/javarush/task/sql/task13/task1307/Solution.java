package ua.javarush.task.sql.task13.task1307;

import ua.javarush.task.sql.task13.task1307.entities.Address;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
OneToOne
Є два класи-ентіті: User та Address. Таблиці, які відповідають їм:

таблиця user з колонками id, first_name, last_name, full_name, address_id;
таблиця address з колонками id, street, city, country.
Домовимося, що кожен користувач може мати лише одну адресу, а кожна адреса може відповідати лише одному користувачеві.

Розстав анотації у класі User перед полем address та у класі Address перед полем user.

Requirements:
1. У полі address має бути анотація JoinColumn з правильними параметрами.
2. У полі address має бути анотація OneToOne.
3. У полі user має бути анотація OneToOne з правильним параметром.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Address> query = session.createQuery("from Address", Address.class);
            List<Address> addresses = query.getResultList();

            for (Address address : addresses) {
                System.out.println(address.getUser().getFullName());
            }
        }
    }
}
