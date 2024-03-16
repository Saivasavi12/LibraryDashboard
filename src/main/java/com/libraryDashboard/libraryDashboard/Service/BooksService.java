package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Books;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;


public interface BooksService {
    //Create operation
    Books createBook(Books book);

    // Read operation
    List<Books> fetchBooks();

    //Fetch a particular book
    Books fetchParticularBook(Long bookId);

    //Update Operation
    Books updateBooks(Books book, Long bookId);

    //Delete operation
    void deleteBook(Long bookId);
}
