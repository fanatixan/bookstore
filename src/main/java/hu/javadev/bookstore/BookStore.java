package hu.javadev.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookStore {

    private String name;
    private String version;

    @Autowired
    public BookStore(@Value("${bookstore.name}") String name, @Value("${bookstore.version}") String version) {

        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "BookStore [name=" + name + ", version=" + version + "]";
    }

}
