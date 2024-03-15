package ua.javarush.task.sql.task14.task1407;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/*
Налаштування EHCache
Є файл ehcache.xml. Додай до нього кастомне налаштування для ентіті Employee з такими атрибутами:

атрибут name з значенням "Employee";
атрибут maxEntriesLocalHeap зі значенням "10000";
атрибут maxEntriesLocalDisk зі значенням "1000";
атрибут eternal зі значенням "false";
атрибут diskSpoolBufferSizeMB зі значенням "20";
атрибут timeToIdleSeconds зі значенням "300";
атрибут timeToLiveSeconds зі значенням "600";
атрибут memoryStoreEvictionPolicy зі значенням "LFU";
атрибут transactionalMode зі значенням "off".

Requirements:
1. У файлі ehcache.xml має бути налаштування для Employee згідно з умовою.
*/
@Entity
@Table(name = "employee")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "smth")
    private String smth;
    @Column(name = "salary")
    private Integer salary;

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

    public String getSmth() {
        return smth;
    }

    public void setSmth(String smth) {
        this.smth = smth;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
