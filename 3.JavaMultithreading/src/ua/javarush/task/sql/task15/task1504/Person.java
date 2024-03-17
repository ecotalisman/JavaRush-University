package ua.javarush.task.sql.task15.task1504;

/*
Стратегія Table per class
Подивися на скрипт створення таблиць. Створи три ентіті-класи за цими таблицями, які описують стратегію Table per class.

Client та Employee успадкуй від Person. Правильно розстав анотації створеним класам. Не забудь про необхідні параметри в анотаціях.

Скрипт:

create table person
(
id int auto_increment primary key,
name varchar(100) not null,
age int not null
);

create table client
(
id int auto_increment primary key,
name varchar(100) not null,
age int not null,
bank varchar(100) not null
);

create table employee
(
id int auto_increment primary key,
name varchar(100) not null,
age int not null,
company varchar(100) not null
);

Requirements:
1. Має бути створено клас Person з полями id, name і age.
2. Має бути створено клас Client з полем bank, який успадковується від класу Person.
3. Має бути створено клас Employee з полем company, який успадковується від класу Person.
4. Клас Person повинен бути позначений анотаціями @Entity, @Table та @Inheritance.
5. Клас Client повинен бути позначений анотацією @Entity.
6. Клас Employee має бути позначений анотацією @Entity.
*/

import jakarta.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
