package com.libraryDashboard.libraryDashboard.Service;

import com.libraryDashboard.libraryDashboard.Entity.Student;
import com.libraryDashboard.libraryDashboard.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceimpl implements  StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student createstudent(Student student) {
        studentRepo.save(student);
        return student;
    }

    @Override
    public List<Student> studentList() {
        List<Student> student = studentRepo.findAll();
        return student;
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);

    }

    @Override
    public Student updateStudent(Long StudentId, Student Student) {
        return null;
    }

    @Override
    public Student getParticularStudent(Long studentId) {
        studentRepo.findById(studentId);
        return null;
    }
}

