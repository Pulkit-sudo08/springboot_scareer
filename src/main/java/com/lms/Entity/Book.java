package com.lms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String author;
    private String genre;
    private Date availableOn;
    private boolean isAvailable;

    public Book(Long id, String name, String author, String genre, Date availableOn, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.availableOn = availableOn;
        this.isAvailable = isAvailable;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", availableOn=" + availableOn +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getAvailableOn() {
        return availableOn;
    }

    public void setAvailableOn(Date availableOn) {
        this.availableOn = availableOn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
