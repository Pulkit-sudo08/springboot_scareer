package com.lms.Service;

import com.lms.Repository.BookRepository;
import com.lms.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;


    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId).get();
    }

    @Override
    public Book getBookByAuthor(String author) {
        return bookRepository.getBookByAuthor(author);
    }

    @Override
    public Book getBookByGenre(String genre) {
        return bookRepository.getBookByGenre(genre);
    }
}
