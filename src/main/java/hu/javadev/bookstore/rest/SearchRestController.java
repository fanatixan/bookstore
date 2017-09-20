package hu.javadev.bookstore.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.javadev.bookstore.model.Book;
import hu.javadev.bookstore.service.BookService;

@RestController
@RequestMapping("/rest/v1/book/search")
public class SearchRestController {

    private BookService bookService;

    @Autowired
    public SearchRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{phrase}")
    public List<Book> getBooks(@PathVariable("phrase") String phrase) {
        return bookService.search(phrase);
    }

    @GetMapping
    public List<Book> getBooks() {
        return getBooks("");
    }

    @ExceptionHandler
    void onError(Exception e) {
        e.printStackTrace();
    }

}
