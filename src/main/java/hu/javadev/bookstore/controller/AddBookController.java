package hu.javadev.bookstore.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.javadev.bookstore.controller.model.AddBookModel;
import hu.javadev.bookstore.controller.request.AddBookRequest;
import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.model.Book;
import hu.javadev.bookstore.model.Genre;
import hu.javadev.bookstore.service.AuthorService;
import hu.javadev.bookstore.service.BookService;

@Controller
@RequestMapping("/addBook")
public class AddBookController {

    private BookService bookService;
    private AuthorService authorService;

    @Autowired
    public AddBookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping
    public String handleRequest() {
        return "addBook";
    }

    @PostMapping
    public String handleRequest(@Valid AddBookRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addBook";
        }

        Author author = authorService.findById(request.getAuthorId());

        Book book = new Book(request.getTitle(), request.getGenre(), Arrays.asList(author));
        bookService.addBook(book);

        return "redirect:/addBook";
    }

    @ModelAttribute("addBookModel")
    public AddBookModel getModel() {
        return new AddBookModel(Arrays.asList(Genre.values()), authorService.getAuthors());
    }

    @ModelAttribute("addBookRequest")
    public AddBookRequest getRequest() {
        return new AddBookRequest();
    }

}
