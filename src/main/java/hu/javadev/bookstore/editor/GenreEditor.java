package hu.javadev.bookstore.editor;

import java.beans.PropertyEditorSupport;

import hu.javadev.bookstore.model.Genre;

public class GenreEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Genre.fromCode(text));
    }

    @Override
    public String getAsText() {
        return ((Genre) getValue()).name();
    }

}
