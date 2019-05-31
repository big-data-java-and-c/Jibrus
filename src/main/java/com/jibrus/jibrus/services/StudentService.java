package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Students;

import java.util.List;

public interface StudentService {
    void addStudent(Students student);
    Students getStudentByName(String name);
    Students getStudentById(int studentId);
    void deleteStudentById(int studentId);
    void editStudent(Students student);
    List<Students> getAllStudents();
    List<Students> getStudentsByGroup();
}
