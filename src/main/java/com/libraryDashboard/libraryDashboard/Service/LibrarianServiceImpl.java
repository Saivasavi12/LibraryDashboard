package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Librarian;
import com.libraryDashboard.libraryDashboard.Repository.LibraranRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibrarianServiceImpl implements LibrarianService {

    @Autowired
    LibraranRepo libraranRepo;
    @Override
    public Librarian createLibrarian(Librarian librarian) {
        libraranRepo.save(librarian);
        return librarian;
    }

    @Override
    public List<Librarian> librariansList() {
        List<Librarian> librarians = libraranRepo.findAll();
        return librarians;
    }

    @Override
    public void deleteLibrarian(Long librarianId) {

    }

    @Override
    public Librarian updateLibrarian(Long librarianId, Librarian librarian) {
        return null;
    }

    @Override
    public Librarian getParticularLibrarian(Long librarianId) {
        return null;
    }
}
