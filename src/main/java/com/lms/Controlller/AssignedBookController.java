package com.lms.Controlller;

import com.lms.Service.AssignedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

public class AssignedBookController {

    @Autowired
    private AssignedBookService assignedBookService;


    @GetMapping("/assignBook/{readerId}/{bookName}")
    public String assignBookForReader(@PathVariable Map<String,String> pathVarsMap)
    {
        Long readerIdLong=Long.parseLong(pathVarsMap.get("readerId"));
        String bookName=pathVarsMap.get("bookName");
        String message= assignedBookService.assignBook(readerIdLong,bookName);
        return message;
    }
}
