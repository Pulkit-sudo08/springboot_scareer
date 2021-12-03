package com.lms.Service;

import com.lms.Entity.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Long bookId);

    Book getBookByAuthor(String author);

    Book getBookByGenre(String genre);
}
