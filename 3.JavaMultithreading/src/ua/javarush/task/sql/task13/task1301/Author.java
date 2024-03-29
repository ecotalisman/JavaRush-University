package ua.javarush.task.sql.task13.task1301;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "full_name")
    private String fullName;

    //напишіть тут ваш код
    @ElementCollection
    @CollectionTable(name = "author_article", joinColumns = @JoinColumn(name = "author_id"))
    @Column(name = "article")
    private Set<String> articles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<String> getArticles() {
        return articles;
    }

    public void setArticles(Set<String> articles) {
        this.articles = articles;
    }
}
