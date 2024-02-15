package ua.javarush.task.sql.task10.task1004;

import jakarta.persistence.*;

/*
Розміщення анотацій
Є три класи-ентіті: Author, Book та Publisher.
Розстав у них анотації, враховуючи, що Author та Publisher є полями Book.
Для спрощення будемо вважати, що кожна книга може мати лише одного автора.

Відповідні таблиці:

таблиця publisher з колонками id, name;
таблиця author з колонками id, first_name, last_name, full_name;
таблиця book з колонками id, title, author_id, publisher_id, publication_year, isbn.

Requirements:
1. У всіх класів мають бути анотації Entity і Table з іменами таблиць.
2. У полів id всіх класів повинні бути анотації Id і GeneratedValue.
3. У всіх полів крім id повинні бути анотації Column або JoinColumn з іменами колонок.
4. У полів, які посилаються на інші ентіті, повинні бути анотації ManyToOne.
*/
@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
