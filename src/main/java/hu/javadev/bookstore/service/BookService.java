package hu.javadev.bookstore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.javadev.bookstore.model.Book;
import hu.javadev.bookstore.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> search(String phrase) {
        return getBooks().stream().filter(b -> b.getTitle().contains(phrase)).collect(Collectors.toList());
    }

}
