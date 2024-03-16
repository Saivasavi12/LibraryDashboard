package com.libraryDashboard.libraryDashboard.Controller;


import com.libraryDashboard.libraryDashboard.Entity.Librarian;
import com.libraryDashboard.libraryDashboard.Service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @PostMapping("/save")
    public Librarian createLibrarian(@RequestBody Librarian librarian) {
       return librarianService.createLibrarian(librarian);
    }

    @GetMapping("/librarianById/{id}")
    public Librarian findLibrarian(@PathVariable("id") Long librarianId) {
        return librarianService.getParticularLibrarian(librarianId);
    }
}
