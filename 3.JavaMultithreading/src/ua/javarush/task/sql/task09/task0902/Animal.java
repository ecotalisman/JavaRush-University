package ua.javarush.task.sql.task09.task0902;

import jakarta.persistence.*;

/* 
Entity
Підключи залежності до проєкту. Для цього натисни Alt+Ctrl+Shift+S (в Ідеї), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не виконати, ти не зможеш локально виконувати код.

Додай до публічного класу Animal приватні поля: id (Long), name (String), age (Integer), family (String).
У класу повинні бути анотації @Entity та @Table (ім'я таблиці animal_table, схема — test).
У всіх полів повинні бути присутні гетери та сеттери.
У поля id має бути відповідна анотація.
В інших полях має бути анотація @Column, в якій вказано ім'я колонки. Ім'я стовпчика збігається з назвою поля.

Requirements:
1. Повинен існувати публічний клас Animal із чотирма приватними полями.
2. У всіх полів повинні бути публічні геттери та сеттери.
3. Анотації рівня класу мають бути розставлені відповідно до умови.
4. Анотації рівня поля мають бути розставлені відповідно до умови.
*/
//напишіть тут ваш код
@Entity
@Table(name = "animal_table", schema = "test")
public class Animal {
    //напишіть тут ваш код
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "family")
    private String family;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}