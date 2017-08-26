package hu.javadev.bookstore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("hu.javadev.bookstore")
@ImportResource("classpath:/spring-config/application.xml")
@PropertySource("classpath:/bookstore.properties")
public class BookStoreConfig {

}
