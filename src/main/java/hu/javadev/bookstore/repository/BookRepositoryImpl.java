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
        if (book.hasId()) {
            for (ListIterator<Book> i = books.listIterator(); i.hasNext();) {
                Book currentBook = i.next();
                if (currentBook.getId() == book.getId()) {
                    i.set(book);
                    return;
                }
            }
        } else {
            book.setId(getNextId());
        }

        books.add(book);
    }

    private long getNextId() {
        return books.stream().map(b -> b.getId()).max(Long::compare).orElse(0L) + 1;
    }

}
