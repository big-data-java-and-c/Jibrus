package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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

    //id_grade z bazy
    @Override
    public void deleteById(Integer grade_id) {

        entityManager.createQuery("DELETE FROM Grade where id_grade =: grade_id").setParameter("grade_id", grade_id).executeUpdate();
//        entityManager.getTransaction().begin();
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        try {
//            entityManager.getTransaction().begin();
//            entityManager.createQuery("DELETE FROM Grade where grade_id =: grade_id").executeUpdate();
//        } catch(Exception ex) {
//            entityManager.getTransaction().rollback();
//            throw ex; // let upper methods know this did not go well
//        }


    }

    @Override
    public void insertGrade(Grade grade) {
        entityManager.createQuery("INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (valueG, data,studId,teachId,subID)")
                .setParameter("valueG", grade.getValue_grade())
                .setParameter("data", grade.getDate_received())
                .setParameter("studId", grade.getStudent())
                .setParameter("teachId", grade.getTeacher())
                .setParameter("subID", grade.getSubject())
                .executeUpdate();
       // INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',1,1,1);
    }

}

