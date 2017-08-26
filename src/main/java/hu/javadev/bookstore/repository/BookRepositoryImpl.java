package hu.javadev.bookstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hu.javadev.bookstore.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private List<Book> books;

    @Autowired
    public BookRepositoryImpl(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

}
