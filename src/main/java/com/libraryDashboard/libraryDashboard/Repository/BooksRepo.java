package com.libraryDashboard.libraryDashboard.Repository;

import com.libraryDashboard.libraryDashboard.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Books, Long> {
}
