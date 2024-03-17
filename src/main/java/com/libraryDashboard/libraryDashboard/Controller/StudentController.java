package com.libraryDashboard.libraryDashboard.Controller;

import com.libraryDashboard.libraryDashboard.Entity.Librarian;
import com.libraryDashboard.libraryDashboard.Entity.Student;
import com.libraryDashboard.libraryDashboard.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createstudent(student);
    }

    @GetMapping("/studentById/{id}")
        public Student findStudent(@PathVariable("id") Long studentId){
            return studentService.getParticularStudent(studentId);
    }
}
