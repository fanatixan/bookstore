package hu.javadev.bookstore.repository;

import java.util.List;

import hu.javadev.bookstore.model.Book;

public interface BookRepository {

    List<Book> getBooks();

    void save(Book book);

}
