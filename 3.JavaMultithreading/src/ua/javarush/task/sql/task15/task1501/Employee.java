package ua.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends Person {
    @Column(name = "company")
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
