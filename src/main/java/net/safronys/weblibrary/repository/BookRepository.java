package net.safronys.weblibrary.repository;

import net.safronys.weblibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
