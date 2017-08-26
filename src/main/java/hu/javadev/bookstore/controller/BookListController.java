package hu.javadev.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.javadev.bookstore.model.Book;
import hu.javadev.bookstore.service.BookService;

@Controller
@RequestMapping("/books")
public class BookListController {

    private BookService bookService;

    @Autowired
    public BookListController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String handleRequest() {
        return "books";
    }

    @ModelAttribute("books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

}
