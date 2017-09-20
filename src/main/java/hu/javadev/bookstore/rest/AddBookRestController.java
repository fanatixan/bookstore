package hu.javadev.bookstore.rest;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.javadev.bookstore.controller.request.AddBookRequest;
import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.model.Book;
import hu.javadev.bookstore.service.AuthorService;
import hu.javadev.bookstore.service.BookService;

@RestController
@RequestMapping("/rest/v1/book")
public class AddBookRestController {

    private BookService bookService;
    private AuthorService authorService;

    @Autowired
    public AddBookRestController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @PostMapping
    public void addBook(@Valid AddBookRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException();
        }
        Author author = authorService.findById(request.getAuthorId());

        Book book = new Book(request.getTitle(), request.getGenre(), Arrays.asList(author));
        bookService.addBook(book);
    }

}
