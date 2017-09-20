package hu.javadev.bookstore.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.InitializingBean;

@Entity
@Table(name = "book")
public class Book implements HasId, InitializingBean {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Transient
    private Date createdAt;

    @Column(name = "title")
    private String title;

    @Transient
    private Genre genre;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    Book() {
    }

    public Book(String title, Genre genre, List<Author> authors) {
        this.title = title;
        this.genre = genre;
        this.authors = authors;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        createdAt = new Date();
    }

    @Override
    public Long getId() {
        return id;
    }

    public boolean hasId() {
        return id != null;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", createdAt=" + createdAt + ", title=" + title + ", genre=" + genre + ", authors=" + authors + ", publisher=" + publisher
                + "]";
    }

}
