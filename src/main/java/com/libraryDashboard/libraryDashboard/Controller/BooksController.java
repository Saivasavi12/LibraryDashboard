package com.libraryDashboard.libraryDashboard.Controller;

import com.libraryDashboard.libraryDashboard.Entity.Books;
import com.libraryDashboard.libraryDashboard.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;
    // Create/Save operation
    @PostMapping("/save")
    public Books saveBooksEntity(@RequestBody Books book){
        return booksService.createBook(book);
    }
    // Update operation
    @PutMapping("/books/{id}")
    public Books updateBooksEntity(@RequestBody Books books, @PathVariable("id") Long bookId)
    {
        return booksService.updateBooks(books,bookId);
    }

    // read operation
    @GetMapping("/fetchAllBooks")
    public List<Books> fetchAllBooks()
    {
        return booksService.fetchBooks();
    }

    @GetMapping("/bookById/{id}")
    public Books fetchAParticularBook(@PathVariable("id") Long bookId)
    {
        return booksService.fetchParticularBook(bookId);
    }

    // delete operation
    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable("id") Long bookId)
    {
        booksService.deleteBook(bookId);
    }

}
