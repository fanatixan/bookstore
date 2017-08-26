package hu.javadev.bookstore.model;

import java.util.Date;

import javax.annotation.PostConstruct;

public class Author implements HasId {

    private long id;
    private Date createdAt;
    private String name;

    public Author(String name) {
        this.name = name;
    }

    @PostConstruct
    void init() {
        createdAt = new Date();
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
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
