package hu.javadev.bookstore.repository;

import java.util.List;

import hu.javadev.bookstore.model.Author;

public class AuthorRepositoryImpl implements AuthorRepository {

    private List<Author> authors;

    public AuthorRepositoryImpl(List<Author> authors) {
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public Author findById(long id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }

        return null;
    }

}
