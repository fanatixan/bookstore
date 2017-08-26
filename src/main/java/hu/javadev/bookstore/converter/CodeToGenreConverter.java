package hu.javadev.bookstore.converter;

import org.springframework.core.convert.converter.Converter;

import hu.javadev.bookstore.model.Genre;

public class CodeToGenreConverter implements Converter<String, Genre> {

    @Override
    public Genre convert(String code) {
        return Genre.fromCode(code);
    }

}
