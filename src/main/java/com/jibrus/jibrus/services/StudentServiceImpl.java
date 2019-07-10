package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.StudentDao;
import com.jibrus.jibrus.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent(Students student) {

    }

    @Override
    public Students getStudentByName(String name) {
        return null;
    }

    @Override
    public Students getStudentById(int studentId) {
        return null;
    }

    @Override
    public void deleteStudentById(int studentId) {

    }

    @Override
    public void editStudent(Students student) {

    }

    @Override
    public Iterable<Students> getAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public List<Students> getStudentsByGroup() {
        return null;
    }
}
