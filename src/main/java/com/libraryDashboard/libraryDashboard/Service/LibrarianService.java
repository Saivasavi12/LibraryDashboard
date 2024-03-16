package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Librarian;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LibrarianService {

    Librarian createLibrarian(Librarian librarian);

    List<Librarian> librariansList();

    void deleteLibrarian(Long librarianId);

    Librarian updateLibrarian(Long librarianId, Librarian librarian);

    Librarian getParticularLibrarian(Long librarianId);

}
