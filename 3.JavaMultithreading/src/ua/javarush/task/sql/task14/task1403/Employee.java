package ua.javarush.task.sql.task14.task1403;

import jakarta.persistence.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.ArrayList;
import java.util.List;

/*
LazyCollectionOption.EXTRA
Є два класи-ентіті: Employee та StatisticView.

У Employee заміни параметр fetch анотації OneToMany на анотацію LazyCollection із значенням EXTRA.
Анотацію JoinColumn заміни на OrderColumn з тим самим параметром.

Requirements:
1. У полі statistics має бути анотація LazyCollection з правильним параметром.
2. У полі statistics має бути анотація OrderColumn з правильним параметром.
3. У полі статистики не повинно бути анотації JoinColumn.
*/

@Entity
@Table(name = "employee")
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

    @Column(name = "salary")
    private Integer salary;

    // It was a condition:
//    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "employee_id")
    @OneToMany(cascade=CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.EXTRA)
    @OrderColumn(name = "employee_id")
    private List<StatisticView> statistics = new ArrayList<>();

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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
