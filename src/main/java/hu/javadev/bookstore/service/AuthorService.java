package hu.javadev.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.repository.AuthorRepository;

@Service
@Transactional
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public Author findById(long id) {
        return authorRepository.findOne(id);
    }

}
