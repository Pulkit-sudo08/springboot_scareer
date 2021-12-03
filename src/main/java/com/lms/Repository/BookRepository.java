package com.lms.Repository;

import com.lms.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("select * from Library.book where isAvailable=1")
    List<Book> getAllBooks();

    @Query("select * from Library.book where author= :authorName")
    Book getBookByAuthor(@Param("authorName") String authorName);

    @Query("select * from Library.book where genre= :genre")
    Book getBookByGenre(@Param("genre") String genre);

    @Query("update Library.Book set isAvailable=1 where bookName= :bookName")
    String unAssignBook(String bookName);

    @Query("select * from Library.assigned_books where readerId= :readerId")
    List<Map<String,Object>> getTimeline(Long readerId);

    @Query("select id from Library.book where bookName= :bookName")
    Long getBookId(String bookName);
}
