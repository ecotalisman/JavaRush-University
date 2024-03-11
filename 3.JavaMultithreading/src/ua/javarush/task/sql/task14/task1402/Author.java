package ua.javarush.task.sql.task14.task1402;

import jakarta.persistence.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;

/*
Анотація LazyCollection
Є три класи-ентіті: Author, Book та Publisher.

У Author та Publisher заміни параметр fetch анотації OneToMany на еквівалентну анотацію LazyCollection.

Відповідні таблиці:

таблиця publisher з колонками id, name, type, discoverer, discovery_date;
таблиця author з колонками id, first_name, last_name, full_name;
таблиця book з колонками id, title, author_id, publisher_id, publication_year, isbn.

Requirements:
1. У полів books повинні бути анотації LazyCollection з правильним параметром.
*/

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "full_name")
    private String fullName;

    // It was a solution:
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "author_id")
    private List<Book> books;

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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
