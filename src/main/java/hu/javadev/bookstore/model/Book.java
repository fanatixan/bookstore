package hu.javadev.bookstore.model;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

public class Book implements HasId, InitializingBean {

    private long id;
    private Date createdAt;
    private String title;
    private List<Author> authors;
    private Publisher publisher;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
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

    @Override
    public String toString() {
        return "Book [id=" + id + ", createdAt=" + createdAt + ", title=" + title + ", authors=" + authors + ", publisher=" + publisher + "]";
    }

}
