package hu.javadev.bookstore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hu.javadev.bookstore.service.AuthorService;
import hu.javadev.bookstore.service.BookService;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config/application.xml");

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.getBooks());

        AuthorService authorService = context.getBean(AuthorService.class);
        System.out.println(authorService.getAuthors());

        context.close();
    }

}
