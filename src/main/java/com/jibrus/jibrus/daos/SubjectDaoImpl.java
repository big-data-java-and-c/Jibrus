package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;
import com.jibrus.jibrus.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SubjectDaoImpl implements SubjectDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<SubjectDto> getAllSubjects() {
        return entityManager.createQuery("SELECT id_subject, name FROM Subject").getResultList();
    }





}
