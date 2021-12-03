package com.lms.Service;

import com.lms.Entity.AssignedBook;
import com.lms.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AssignedBookServiceImpl implements AssignedBookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AssignedBook assignedBook;


    @Override
    public String assignBook(Long readerIdLong, String bookName) {

       Long bookId= bookRepository.getBookId(bookName);
       assignedBook.setBookId(bookId);
       assignedBook.setBook_name(bookName);
       assignedBook.setReaderId(readerIdLong);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        assignedBook.setAssigned_on(dtf.format(now));

        return "Book Assigned Successfully";
    }
}
