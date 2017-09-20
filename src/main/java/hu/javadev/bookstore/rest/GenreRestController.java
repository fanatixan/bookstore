package hu.javadev.bookstore.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.javadev.bookstore.model.Genre;

@RestController
@RequestMapping("/rest/v1/genre")
public class GenreRestController {

    @GetMapping
    public List<Genre> getAuthors() {
        return Arrays.asList(Genre.values());
    }

}
