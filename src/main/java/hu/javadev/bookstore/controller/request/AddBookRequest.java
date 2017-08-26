package hu.javadev.bookstore.controller.request;

import org.hibernate.validator.constraints.NotBlank;

import hu.javadev.bookstore.model.Genre;

public class AddBookRequest {

    @NotBlank(message = "A cím megadása kötelező!")
    private String title;

    private Genre genre;
    private long authorId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

}
