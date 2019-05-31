package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.StudentDao;
import com.jibrus.jibrus.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    private static Logger logger = Logger.getLogger(StudentServiceImpl.class.getName());

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    @Transactional
    public void addStudent(Students student) {
         studentDao.addStudent(student);
    }

    @Override
    public Students getStudentByName(String name) {
        return null;
    }

    @Override
    @Transactional
    public Students getStudentById(int studentId) {
        Students studentToCheck = studentDao.getStudentById(studentId);
        if (studentToCheck == null) {
            logger.info("Student o takim ID nie istnieje");
            return null;
        }
        logger.info("Pobrano studenta o ID: " + studentId);
        return studentToCheck;
    }

    @Override
    public void deleteStudentById(int studentId) {

    }

    @Override
    public void editStudent(Students student) {

    }

    @Override
    public List<Students> getAllStudents() {
        return null;
    }

    @Override
    public List<Students> getStudentsByGroup() {
        return null;
    }
}
