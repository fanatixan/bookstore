package hu.javadev.bookstore.model;

import java.util.Date;

public class Publisher implements HasId {

    private long id;
    private Date createdAt;
    private String name;
    private String description;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Publisher [id=" + id + ", createdAt=" + createdAt + ", name=" + name + ", description=" + description + "]";
    }

}
