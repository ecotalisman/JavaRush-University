package ua.javarush.task.sql.task15.task1501;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client extends Person {
    @Column(name = "bank")
    private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
