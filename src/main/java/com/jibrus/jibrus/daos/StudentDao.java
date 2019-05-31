package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Students;

import java.util.List;

public interface StudentDao {
    void addStudent(Students student);
    Students getStudentByName(String name);
    Students getStudentById(int studentId);
    void deleteStudentById(int studentId);
    void editStudent(Students student);
    List<Students> getAllStudents();
    List<Students> getStudentsByGroup();
}
