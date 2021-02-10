package net.safronys.weblibrary.service;

import net.safronys.weblibrary.model.Book;
import net.safronys.weblibrary.model.User;

import java.util.List;

public interface BookService {
    Book getToId(Long id);

    List<Book> getAll();

    void delete(Long id);

    void addBook(Book book);
}
