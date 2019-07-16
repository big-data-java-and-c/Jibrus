package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.StudentDao;
import com.jibrus.jibrus.entities.Groups;
import com.jibrus.jibrus.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    private GroupSerivce groupSerivce;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao, GroupSerivce groupSerivce) {
        this.studentDao = studentDao;
        this.groupSerivce = groupSerivce;
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
        return studentDao.findById(studentId);
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

    @Override public Iterable<Students> getStudentsByGroupId(Integer id) {
        Groups group = groupSerivce.getGroupById(id);
        return studentDao.findAllByGroup(group);
    }

}
