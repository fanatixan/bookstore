package hu.javadev.bookstore.repository;

import java.util.List;

import hu.javadev.bookstore.model.Author;

public interface AuthorRepository {

    public List<Author> getAuthors();

}
