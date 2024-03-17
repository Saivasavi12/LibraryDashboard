package com.libraryDashboard.libraryDashboard.Repository;

import com.libraryDashboard.libraryDashboard.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
