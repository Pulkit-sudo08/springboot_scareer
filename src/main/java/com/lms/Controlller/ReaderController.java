package com.lms.Controlller;

import com.lms.Repository.BookRepository;
import com.lms.Repository.ReaderRepository;
import com.lms.Service.ReaderService;
import com.lms.Entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ReaderRepository readerRepository;


    @PostMapping("/addReader")
    public Reader addBook(@RequestBody Reader reader)
    {

        return readerService.addReader(reader);
    }


    @GetMapping("/unAssignBook/{readerId}/{bookName}")
    public void unAssignBookForReader(@PathVariable Map<String,String> pathVarsMap)
    {
        String bookName=pathVarsMap.get("bookName");
        bookRepository.unAssignBook(bookName);

    }

    @GetMapping("/readerTimeline/{readerId}")
    public List<Map<String,Object>> getTimeline(@PathVariable("readerId") Long readerId)
    {
        List<Map<String,Object>> readerTimeline=  bookRepository.getTimeline(readerId);
        return  readerTimeline;
    }

    @GetMapping("/bookHistory/{bookName}")
    public List<Map<String,Object>> getBookHistoryInfo(@PathVariable("bookName") String bookName)
    {
        List<Map<String,Object>> bookHistory=readerRepository.getBookHistory(bookName);
        return  bookHistory;

    }


}
