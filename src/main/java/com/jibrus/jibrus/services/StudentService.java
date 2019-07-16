package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Students;

public interface StudentService {
    void addStudent(Students student);
    Students getStudentByName(String name);
    Students getStudentById(int studentId);
    void deleteStudentById(int studentId);
    void editStudent(Students student);
    Iterable<Students> getAllStudents();
    Iterable<Students> getStudentsByGroupId(Integer id);
}
