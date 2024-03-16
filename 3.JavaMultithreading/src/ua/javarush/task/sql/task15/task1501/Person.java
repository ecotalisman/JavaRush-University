package ua.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

/*
Стратегія MappedSuperClass
Подивися на скрипт створення таблиць. Створи класи-сутності цих таблиць. Зверни увагу на повторювані поля.

Щоб уникнути дублювання використовуй успадкування. Розстав правильно анотації створеним класам. Не забудь про поле Long id у кожному класі-сутності.

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
`id` INT not null auto_increment,
`name` VARCHAR(100) not null,
`age` INT not null,
`company` VARCHAR(100) not null,
PRIMARY KEY (id)
);

CREATE TABLE `client`
(
`id` INT not null auto_increment,
`name` VARCHAR(100) not null,
`age` INT not null,
`bank` VARCHAR(100) not null,
PRIMARY KEY (id)
);

Requirements:
1. Має бути створено клас Person з полями id, name і age.
2. Має бути створено клас Client з полем bank, який успадковується від класу Person.
3. Має бути створено клас Employee з полем company, який успадковується від класу Person.
4. Клас Person повинен бути позначеним анотаціями @MappedSuperclass та @Table.
5. Клас Client повинен бути позначеним анотаціями @Entity та @Table.
6. Клас Employee має бути позначеним анотаціями @Entity та @Table.
*/

@MappedSuperclass
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

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
}
