package ua.javarush.task.sql.task12.task1204;

/* 
Час створення та зміни даних
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

Додай до публічного класу Solution приватні поля id (Long), name (String), createDate (Date) та updateDate (Date).
У класу Solution повинні бути анотації @Entity та @Table (ім'я таблиці names_table , Схема — test).
У всіх полях повинні бути присутні геттери та сеттери.
У всіх полів повинні бути відповідні анотації.
У поля id має бути анотація @Id.
У поля name має бути анотація @Column, в якій зазначено ім'я колонки "name".
У поля createDate має бути анотація @Column, в якій зазначено ім'я колонки "create_date", та решта необхідних анотацій,
які потрібні для колонки, що зберігає дату створення запису.
поля updateDate має бути анотація @Column, в якій зазначено ім'я колонки "update_date", та всі інші необхідні анотації,
які потрібні для колонки, що зберігає дату останньої зміни запису.

Requirements:
1. Клас Solution повинен бути публічним і містити чотири приватні поля згідно з умовами.
2. У класі Solution у полів мають бути публічні геттери та сеттери.
3. У класі Solution анотації рівня класу мають бути розставлені відповідно до умов.
4. У класі Solution анотації рівня поля мають бути розставлені відповідно до умов.
*/

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

//напишіть тут ваш код
@Entity
@Table(name = "names_table", schema = "test")
public class Solution {
    //напишіть тут ваш код
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
