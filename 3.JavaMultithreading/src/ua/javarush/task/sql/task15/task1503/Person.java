package ua.javarush.task.sql.task15.task1503;

/*
Стратегія Joined Table
Подивися на скрипт створення таблиць. Створи три ентіті-класи за цими таблицями, які описують стратегію Joined Table.

Client та Employee успадкуй від Person. Правильно розстав анотації створеним класам. Не забудь про необхідні параметри
в анотаціях.

Скрипт:

CREATE TABLE `person`
(
`id` INT not null auto_increment,
`name` VARCHAR(100) not null,
`age` INT not null,
PRIMARY KEY (id)
);

CREATE TABLE `employee`
(
`person_id` INT not null,
`company` VARCHAR(100) not null
);

CREATE TABLE `client`
(
`person_id` INT not null,
`bank` VARCHAR(100) not null
);

Requirements:
1. Має бути створено клас Person з полями id, name і age.
2. Має бути створено клас Client з полем bank, який успадковується від класу Person.
3. Має бути створено клас Employee з полем company, який успадковується від класу Person.
4. Клас Person повинен бути позначений анотаціями @Entity, @Table та @Inheritance.
5. Клас Client повинен бути позначений анотаціями @Entity та @PrimaryKeyJoinColumn.
6. Клас Employee має бути позначений анотаціями @Entity та @PrimaryKeyJoinColumn.
*/

import jakarta.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
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
