package net.safronys.weblibrary.service.Impl;

import net.safronys.weblibrary.model.Book;
import net.safronys.weblibrary.repository.BookRepository;
import net.safronys.weblibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getToId(Long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
