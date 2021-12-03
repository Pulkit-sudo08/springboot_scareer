package com.lms.Repository;

import com.lms.Entity.Book;
import com.lms.Entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ReaderRepositoryImpl  implements ReaderRepository {

    @Autowired
    Book book;

    @Override
    public String assignBook(Long readerId,String bookName) {
        Book bookToBeAssigned=findBook(bookName);
        Long bookId=bookToBeAssigned.getId();
        String assignBookName=bookToBeAssigned.getName();
        assigningBook(bookId,readerId,assignBookName);
        setIsAvailable(assignBookName);
        return "Book is Assigned Successfully!";
    }

    @Override
    public Book findBook(String bookName) {

        return null;
    }

    @Override
    public void assigningBook(Long bookId, Long readerId, String book_name) {

    }

    @Override
    public void setIsAvailable(String bookName) {

    }

    @Override
    public List<Map<String, Object>> getBookHistory(String bookName) {
        return null;
    }

    @Override
    public List<Reader> findAll() {
        return null;
    }

    @Override
    public List<Reader> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Reader> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Reader> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Reader entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Reader> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Reader> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Reader> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Reader> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Reader> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Reader> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Reader> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Reader getOne(Long aLong) {
        return null;
    }

    @Override
    public Reader getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Reader> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Reader> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Reader> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Reader> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Reader> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Reader> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Reader, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
