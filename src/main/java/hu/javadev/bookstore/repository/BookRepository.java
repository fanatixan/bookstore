package hu.javadev.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.javadev.bookstore.model.Book;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContains(String title);

}
