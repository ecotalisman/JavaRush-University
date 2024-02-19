package ua.javarush.task.sql.task12.task1202;

/* 
Entity з обчисленнями
Якщо раніше не підключав залежності, підключи їх. Для цього використовуй Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

Додай до публічного класу Salaries приватні поля employeeID (Long), paymentCode (Boolean), employeeName (String),
basicSalary (double), bonus (double), tax (double) та total (double).

У класі повинні бути анотації @Entity та @Table (ім'я таблиці salaries_table, схема — salaries).

У всіх полях повинні бути присутні геттери та сеттери.

У полі employeeID має бути відповідна анотація.

У полі paymentCode має бути анотація @Type, в якій правильно вказано тип NumericBooleanType.

У поля total має бути анотація @Formula, в якій обчислюється загальна сума використовуючи формулу
"basicSalary + bonus - tax".

У всіх полях, крім employeeID, має бути анотація @Column, в якій зазначено ім'я колонки. Ім'я колонки має збігатися
з назвою поля.

Requirements:
1. Клас Salaries повинен бути публічним та містити сім приватних полів.
2. У полів повинні бути публічні геттери та сеттери.
3. Анотації рівня класу мають бути розставлені відповідно до умови.
4. Анотації рівня поля мають бути розставлені відповідно до умови.
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;

//напишіть тут ваш код
@Entity
@Table(name = "salaries_table", schema = "salaries")
public class Salaries {
    //напишіть тут ваш код
    @Id
    private Long employeeID;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "paymentCode")
    private Boolean paymentCode;
    @Column(name = "employeeName")
    private String employeeName;
    @Column(name = "basicSalary")
    private double basicSalary;
    @Column(name = "bonus")
    private double bonus;
    @Column(name = "tax")
    private double tax;
    @Formula(value = "basicSalary + bonus - tax")
    @Column(name = "total")
    private double total;

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public Boolean getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(Boolean paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
