package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Books;
import com.libraryDashboard.libraryDashboard.Repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



public class BooksImpl implements BooksService{
    @Autowired
    private BooksRepo booksRepo;
    @Override
    public Books createBook(Books book) {
        booksRepo.save(book);
        return book;
    }

    @Override
    public List<Books> fetchBooks() {
        List<Books> booksList = booksRepo.findAll();
        return booksList;
    }

    @Override
    public Books updateBooks(Books book, Long bookId) {
        return null;
    }

    @Override
    public void deleteBook(Long bookId) {
        booksRepo.deleteById(bookId);
    }
}
