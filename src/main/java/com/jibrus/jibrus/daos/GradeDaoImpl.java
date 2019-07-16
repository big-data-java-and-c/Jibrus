package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GradeDaoImpl implements GradeDao {
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

    public Iterable<Grade> getGradesByStudentId(int studentId) {
        return (List<Grade>) entityManager.createQuery("FROM Grade where student_id =: studentId")
                .setParameter("studentId", studentId)
                .getResultList();
    }

    @Override
    public Iterable<Grade> getGradesBySubjectIdAndStudentId(int subjectId, int studentId) {
        return entityManager.createQuery("FROM Grade where subject_id =: subjectId AND student_id =: studentId")
                .setParameter("subjectId", subjectId)
                .setParameter("studentId", studentId)
                .getResultList();
    }

    @Override
    public Iterable<Integer> getGradesValueBySubjectIdAndStudentId(int subjectId, int studentId) {
        return entityManager.createQuery("SELECT value_grade FROM Grade where subject_id =: subjectId AND student_id =: studentId")
                .setParameter("subjectId", subjectId)
                .setParameter("studentId", studentId)
                .getResultList();
    }

}

