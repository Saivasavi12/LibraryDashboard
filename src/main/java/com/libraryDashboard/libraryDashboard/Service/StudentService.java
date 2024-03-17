package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Student;

import java.util.List;

public interface StudentService {

    Student createstudent(Student  Student);

    List<Student> studentList();

    void deleteStudent(Long StudentId);

    Student updateStudent(Long StudentId, Student Student);

    Student  getParticularStudent(Long StudentId);
}
