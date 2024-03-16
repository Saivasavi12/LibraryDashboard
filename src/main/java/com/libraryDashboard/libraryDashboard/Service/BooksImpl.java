package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Books;
import com.libraryDashboard.libraryDashboard.Repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class BooksImpl implements BooksService{
    @Autowired
    private BooksRepo booksRepo;
    @Override
    public Books createBook(Books book) {
        return booksRepo.save(book);
    }

    @Override
    public List<Books> fetchBooks() {
        List<Books> booksList = booksRepo.findAll();
        return booksList;
    }

    @Override
    public Books fetchParticularBook(Long bookId)
    {
        Books book = booksRepo.findById(bookId).get();
        return book;
    }

    @Override
    public Books updateBooks(Books book, Long bookId) {

        Books bookObject = booksRepo.findById(bookId).get();
    // What if the fields are empty in the DB ? and can we update those
      /*  if (Objects.nonNull(book.getBookName())
                && !"".equalsIgnoreCase(
                book.getBookName())) {
            bookObject.setBookName(
                    bookObject.getBookName());
        }*/
        if(book.getBookName() != null)
        {
            bookObject.setBookName(book.getBookName());
        }
        if(book.getPublicationYear() != 0) // primitive data types like INT can't be null
        {
            bookObject.setPublicationYear(book.getPublicationYear());
        }
       if(book.getNoOfCopiesAvailable() != 0)
       {
           bookObject.setNoOfCopiesAvailable(book.getNoOfCopiesAvailable());
       }
       if(book.getNoOfCopiesBorrowed() != 0)
       {
           bookObject.setNoOfCopiesBorrowed(book.getNoOfCopiesBorrowed());
       }
       if(Objects.nonNull(book.getAuthors()) && book.getAuthors().length > 0)
       {
           bookObject.setAuthors(book.getAuthors());
       }
        return booksRepo.save(bookObject);
    }

    @Override
    public void deleteBook(Long bookId) {

        booksRepo.deleteById(bookId);
    }
}
