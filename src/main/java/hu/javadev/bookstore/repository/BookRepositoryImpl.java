package hu.javadev.bookstore.repository;

import java.util.List;
import java.util.ListIterator;

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

    @Override
    public void save(Book book) {
        for (ListIterator<Book> i = books.listIterator(); i.hasNext();) {
            Book currentBook = i.next();
            if (currentBook.getId() == book.getId()) {
                i.set(book);
                return;
            }
        }

        books.add(book);
    }

}
