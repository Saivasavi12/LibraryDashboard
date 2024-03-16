package com.libraryDashboard.libraryDashboard.Entity;

import jakarta.persistence.Id;

public class Student {

    @Id

    private Long studentId;

    private String studentName;

    private String studentEmail;

    private String[] booksTaken;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String[] getBooksTaken() {
        return booksTaken;
    }

    public void setBooksTaken(String[] booksTaken) {
        this.booksTaken = booksTaken;
    }

    public Student(Long studentId, String studentName, String studentEmail, String[] booksTaken) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.booksTaken = booksTaken;
    }

    public Student() {
    }
}
