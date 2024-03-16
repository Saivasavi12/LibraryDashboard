package com.libraryDashboard.libraryDashboard.Entity;

import jakarta.persistence.Id;

public class Books {
    @Id
    private Long bookId;
    private String bookName;
    private int publicationYear;
    private int noOfCopiesAvailable;
    private int noOfCopiesBorrowed;
    private String[] authors;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Books() {
    }

    public Books(Long bookId, String bookName, int publicationYear, int noOfCopiesAvailable, int noOfCopiesBorrowed, String[] authors) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.noOfCopiesAvailable = noOfCopiesAvailable;
        this.noOfCopiesBorrowed = noOfCopiesBorrowed;
        this.authors = authors;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNoOfCopiesAvailable() {
        return noOfCopiesAvailable;
    }

    public void setNoOfCopiesAvailable(int noOfCopiesAvailable) {
        this.noOfCopiesAvailable = noOfCopiesAvailable;
    }

    public int getNoOfCopiesBorrowed() {
        return noOfCopiesBorrowed;
    }

    public void setNoOfCopiesBorrowed(int noOfCopiesBorrowed) {
        this.noOfCopiesBorrowed = noOfCopiesBorrowed;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }



}
