package com.lms.Entity;

public class AssignedBook {

    private long bookId;
    private long readerId;
    private String book_name;
    private String assigned_on;

    public AssignedBook(long bookId, long readerId, String book_name, String assigned_on) {
        this.bookId = bookId;
        this.readerId = readerId;
        this.book_name = book_name;
        this.assigned_on = assigned_on;
    }

    @Override
    public String toString() {
        return "AssignedBook{" +
                "bookId=" + bookId +
                ", readerId=" + readerId +
                ", book_name='" + book_name + '\'' +
                ", assigned_on=" + assigned_on +
                '}';
    }

    public AssignedBook() {
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long readerId) {
        this.readerId = readerId;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAssigned_on() {
        return assigned_on;
    }

    public void setAssigned_on(String assigned_on) {
        this.assigned_on = assigned_on;
    }
}
