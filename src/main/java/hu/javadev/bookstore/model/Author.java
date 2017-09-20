package hu.javadev.bookstore.model;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "author")
public class Author implements HasId {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Transient
    private Date createdAt;

    @Column(name = "name")
    private String name;

    Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    @PostConstruct
    void init() {
        createdAt = new Date();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", createdAt=" + createdAt + ", name=" + name + "]";
    }

}
