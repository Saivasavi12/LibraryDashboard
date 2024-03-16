package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Librarian;
import com.libraryDashboard.libraryDashboard.Repository.LibraranRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
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
        libraranRepo.deleteById(librarianId);
    }

    @Override
    public Librarian updateLibrarian(Long librarianId, Librarian librarian) {
        Librarian lib = libraranRepo.findById(librarianId).get();

        if(Objects.nonNull(librarian.getLibrarianName())
                && !"".equalsIgnoreCase(
                librarian.getLibrarianName()))
            lib.setLibrarianName(librarian.getLibrarianName());

        if(Objects.nonNull(librarian.getEmail())
                && !"".equalsIgnoreCase(
                librarian.getEmail()))
            lib.setEmail(librarian.getEmail());

        return lib;
    }

    @Override
    public Librarian getParticularLibrarian(Long librarianId) {
        Librarian lib = libraranRepo.findById(librarianId).get();
        return lib;
    }
}
