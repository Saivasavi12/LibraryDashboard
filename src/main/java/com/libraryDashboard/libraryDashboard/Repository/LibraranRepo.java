package com.libraryDashboard.libraryDashboard.Repository;

import com.libraryDashboard.libraryDashboard.Entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraranRepo extends JpaRepository<Librarian, Long> {
}
