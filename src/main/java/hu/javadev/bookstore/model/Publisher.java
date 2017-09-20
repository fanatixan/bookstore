package hu.javadev.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "publisher")
public class Publisher implements HasId {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Transient
    private Date createdAt;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    public Publisher() {
    }

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
