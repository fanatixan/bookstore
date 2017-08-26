package hu.javadev.bookstore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hu.javadev.bookstore.config.BookStoreConfig;
import hu.javadev.bookstore.service.AuthorService;
import hu.javadev.bookstore.service.BookService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookStoreConfig.class);

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.getBooks());

        AuthorService authorService = context.getBean(AuthorService.class);
        System.out.println(authorService.getAuthors());

        context.close();
    }

}
