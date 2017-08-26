package hu.javadev.bookstore.controller.model;

import java.util.List;

import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.model.Genre;

public class AddBookModel {

    private List<Genre> genres;
    private List<Author> authors;

    public AddBookModel(List<Genre> genres, List<Author> authors) {
        this.genres = genres;
        this.authors = authors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<Author> getAuthors() {
        return authors;
    }

}
