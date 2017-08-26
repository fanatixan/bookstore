package hu.javadev.bookstore.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.repository.AuthorRepository;
import hu.javadev.bookstore.repository.AuthorRepositoryImpl;
import hu.javadev.bookstore.service.AuthorService;

@Configuration
public class AuthorConfig {

    @Autowired
    private List<Author> authors;

    @Bean
    public AuthorRepository authorRepository() {
        return new AuthorRepositoryImpl(authors);
    }

    @Bean
    public AuthorService authorService() {
        return new AuthorService(authorRepository());
    }

}
