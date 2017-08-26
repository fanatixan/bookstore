package hu.javadev.bookstore.model;

public class Author {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + "]";
    }

}
