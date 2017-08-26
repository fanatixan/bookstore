package hu.javadev.bookstore.service;

import java.util.List;

import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.repository.AuthorRepository;

public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors() {
        return authorRepository.getAuthors();
    }

    public Author findById(long id) {
        return authorRepository.findById(id);
    }

}
