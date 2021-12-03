package com.lms.Service;

import com.lms.Entity.Reader;
import com.lms.Repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderServiceImpl implements ReaderService{

    @Autowired
    private ReaderRepository readerRepository;
    @Override
    public Reader addReader(Reader reader) {
        return readerRepository.save(reader);
    }

}
