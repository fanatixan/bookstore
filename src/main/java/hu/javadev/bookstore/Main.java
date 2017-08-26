package hu.javadev.bookstore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hu.javadev.bookstore.model.Author;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config/application.xml");

        Author orwell = context.getBean("orwell", Author.class);
        System.out.println(orwell);

        Author herriot = context.getBean("herriot", Author.class);
        System.out.println(herriot);

        context.close();
    }

}
