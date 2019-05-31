package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GradeDaoImpl implements GradeDao{
    private EntityManager entityManager;

    @Autowired
    public GradeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Grade getGradeById(int id) {
        return (Grade) entityManager.createQuery("FROM Grade where id_grade =: id")
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<Grade> getGradesByStudentId(int studentId){
        return (List<Grade>) entityManager.createQuery("FROM Grade where student_id =: studentId")
                .setParameter("studentId", studentId)
                .getResultList();
    }

}

