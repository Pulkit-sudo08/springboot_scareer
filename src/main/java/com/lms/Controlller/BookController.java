package com.lms.Controlller;

import com.lms.Entity.Book;
import com.lms.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

        @PostMapping("/Books")
        public Book addBook(@RequestBody Book book)
        {

            return bookService.addBook(book);
        }

        @GetMapping("/Books")
        public List<Book> getAllBooks()
        {
            return bookService.getAllBooks();

        }


        @GetMapping("Books/{author}")
    public Book getBookByAuthor(@PathVariable("author") String author)
        {
            return bookService.getBookByAuthor(author);
        }

    @GetMapping("Books/{genre}")
    public Book getBookByGenre(@PathVariable("genre") String genre)
    {
        return bookService.getBookByGenre(genre);
    }








}
