package hu.javadev.bookstore.model;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private Publisher publisher;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
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
        return "Book [title=" + title + ", authors=" + authors + ", publisher=" + publisher + "]";
    }

}
