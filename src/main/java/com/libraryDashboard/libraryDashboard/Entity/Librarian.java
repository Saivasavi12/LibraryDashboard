package com.libraryDashboard.libraryDashboard.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Librarian {

    @Id
    private Long librarianId;
    private String librarianName;
    private String email;
    private String[] permissions;

    public Long getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(Long librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public Librarian() {
    }

    public Librarian(Long librarianId, String librarianName, String email, String[] permissions) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.email = email;
        this.permissions = permissions;
    }
}
