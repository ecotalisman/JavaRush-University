package ua.javarush.task.sql.task12.task1203;

/* 
Зберігаємо об'єкт до БД
*/

import jakarta.persistence.*;

import java.time.Instant;
import java.time.ZonedDateTime;

//напишіть тут ваш код
@Entity
@Table(name = "time_table", schema = "test")
public class TimeClass {
    //напишіть тут ваш код
    @Id
    private Long id;
    @Column(name = "instant")
    private Instant instant;
    @Basic
    @Column(name = "zoned_time")
    private ZonedDateTime zonedDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }
}