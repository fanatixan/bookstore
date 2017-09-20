package hu.javadev.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.javadev.bookstore.model.Author;

@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
