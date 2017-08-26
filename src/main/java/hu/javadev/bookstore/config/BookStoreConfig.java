package hu.javadev.bookstore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("hu.javadev.bookstore")
@ImportResource("classpath:/spring-config/application.xml")
public class BookStoreConfig {

}
