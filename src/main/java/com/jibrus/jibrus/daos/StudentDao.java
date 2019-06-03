package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<Students,Long> {
    void addStudent(Students student);
    Students getStudentByName(String name);
    Students getStudentById(int studentId);
    void deleteStudentById(int studentId);
    void editStudent(Students student);
    List<Students> getAllStudents();
    List<Students> getStudentsByGroup();
}
