package com.lms.Repository;

import com.lms.Entity.Book;
import com.lms.Entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ReaderRepository extends JpaRepository<Reader,Long> {


    String assignBook(Long readerId, String bookName);

    @Query("select * from Library.book where isAvailable=1")
    public Book findBook(@Param("bookName") String bookName);


    @Query("insert into Library.assigned_books(bookId,readerId,book_name,assigned_on) values(?1,?2,?3,now())")
    public void assigningBook(Long bookId,Long readerId,String book_name);

    @Query("update Library.assigned_books set isAvailable=0 where book_name= ?1")
    public void setIsAvailable(String assignBookName);

    @Query("select ab.book_name,concat(lr.firstName, ,lr.lastName) from Library.assigned_books as ab where book_name= ?1" +
            "JOIN Library.reader as lr on(lr.id=ab.readerID")
    List<Map<String, Object>> getBookHistory(String bookName);
}
