package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class TeacherDaoImpl  {

    @Autowired
    private EntityManager entityManager;

    public Teacher getTeacherById(int id) {
        return (Teacher) entityManager.createQuery("FROM Teacher WHERE id_teacher =: id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
