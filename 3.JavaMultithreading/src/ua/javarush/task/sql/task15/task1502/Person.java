package ua.javarush.task.sql.task15.task1502;

/*
Стратегія Single Table
Подивися на скрипт створення таблиці person. Створи три ентіті-класи за цією таблицею, які описують стратегію
Single Table: крім ентіті Person повинні бути створені ентіті-класи Client (з полем bank) та Employee (з полем company),
які успадкуй від Person.

Об'єкти класів Client та Employee потрібно зберігати в одній таблиці (person) з використанням числових дескрипторів.
Для Client використовуй значення дескриптора 1, для Employee — 2.

Правильно розстав анотації створеним класам. Не забудь про необхідні параметри в анотаціях.

Скрипт:

CREATE TABLE `person`
(
`id` INT not null auto_increment,
`name` VARCHAR(100) null,
`age` INT null,
`bank` VARCHAR(100) null,
`company` VARCHAR(100) null,
`person_type` INT not null,
PRIMARY KEY (id)
);

Requirements:
1. Має бути створено клас Person з полями id, name і age.
2. Має бути створено клас Client з полем bank, який успадковується від класу Person.
3. Має бути створено клас Employee з полем company, який успадковується від класу Person.
4. Клас Person повинен бути позначений анотаціями @Entity, @Table, @Inheritance та @DiscriminatorColumn.
5. Клас Client повинен бути позначений анотаціями @Entity та @DiscriminatorValue.
6. Клас Employee має бути позначений анотаціями @Entity та @DiscriminatorValue.
*/

import jakarta.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "person_type",discriminatorType = DiscriminatorType.INTEGER)
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
