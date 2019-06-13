package com.jibrus.jibrus.daos;


import com.jibrus.jibrus.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDaoImp  {

    private EntityManager entityManager;

    @Autowired
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void addStudent(Students student) {
        entityManager.persist(student);
    }


    public Students getStudentByName(String name) {
        return (Students) entityManager.createQuery("FROM STUDENTS WHERE FIRST_NAME=:name")
                .setParameter("name",name)
                .getSingleResult();
    }


    public Students getStudentById(int studentId) {
        return (Students) entityManager.createQuery("FROM Students WHERE student_id=:studentId")
                .setParameter("studentId",studentId)
                .getSingleResult();

    }


}