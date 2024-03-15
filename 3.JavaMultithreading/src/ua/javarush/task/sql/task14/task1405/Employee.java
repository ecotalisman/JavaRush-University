package ua.javarush.task.sql.task14.task1405;

import jakarta.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.HashSet;
import java.util.Set;

/*
Кеш другого рівня
Є два класи-ентіті: Employee та Task.

Додай їм анотації, щоб для них був задіяний кеш другого рівня. Додай потрібні анотації, щоб залежності Entity-класів теж кешувалися.

У всіх випадках використовуй стратегію кешування read-write.

Requirements:
1. Повинні бути розставлені правильні анотації відповідно до умови.
*/

@Entity
@Table(name = "employee")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)                   // Add @Cache here:
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "smth")
    private String smth;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_task",
            joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "task_id", referencedColumnName = "id"))
    @LazyCollection(LazyCollectionOption.EXTRA)
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)               // Add @Cache here:
    private Set<Task> tasks = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSmth() {
        return smth;
    }

    public void setSmth(String smth) {
        this.smth = smth;
    }
}

