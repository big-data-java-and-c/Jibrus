package com.jibrus.jibrus.daos;


import com.jibrus.jibrus.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDaoImp implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void addStudent(Students student) {
        entityManager.persist(student);
    }

    @Override
    public Students getStudentByName(String name) {
        return (Students) entityManager.createQuery("FROM STUDENTS WHERE FIRST_NAME=:name")
                .setParameter("name",name)
                .getSingleResult();
    }

    @Override
    public Students getStudentById(int studentId) {
        return (Students) entityManager.createQuery("FROM Students WHERE student_id=:studentId")
                .setParameter("studentId",studentId)
                .getSingleResult();

    }

    @Override
    public void deleteStudentById(int studentId) {

    }

    @Override
    public void editStudent(Students student) {

    }

    @Override
    public List<Students> getAllStudents() {
        return  entityManager.createQuery("FROM Students")
                .getResultList();
    }

    @Override
    public List<Students> getStudentsByGroup() {
        return null;
    }
}