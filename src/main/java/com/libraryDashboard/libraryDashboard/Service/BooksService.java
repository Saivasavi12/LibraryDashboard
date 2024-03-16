package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Books;

import java.util.List;

public interface BooksService {
    //Create operation
    Books createBook(Books book);

    // Read operation
    List<Books> fetchBooks();

    //Update Operation
    Books updateBooks(Books book, Long bookId);

    //Delete operation
    void deleteBook(Long bookId);
}
