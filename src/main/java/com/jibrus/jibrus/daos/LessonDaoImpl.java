package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LessonDaoImpl implements LessonDao{
    @Autowired
    private EntityManager entityManager;

    public Lesson getLessonById(int id) {
        return (Lesson) entityManager.createQuery("FROM Lesson WHERE id_lesson =: id")
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<Lesson> getLessonBySubjectId(int id) {
        return (List<Lesson>) entityManager.createQuery("FROM Lesson WHERE id_subject =: id")
                .setParameter("id", id)
                .getResultList();
    }

    public List<Lesson> getLessonByGroupId(int id) {
        return (List<Lesson>) entityManager.createQuery("FROM Lesson WHERE id_group =: id")
                .setParameter("id", id)
                .getResultList();
    }

    public List<Lesson> getLessonByTeacherId(int id) {
        return (List<Lesson>) entityManager.createQuery("FROM Lesson WHERE teacher_id =: id")
                .setParameter("id", id)
                .getResultList();
    }
}
