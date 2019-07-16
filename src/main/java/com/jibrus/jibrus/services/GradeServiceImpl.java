package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.GradeDao;
import com.jibrus.jibrus.entities.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GradeServiceImpl implements GradeService{
    @Autowired
    private GradeDao gradeDao;

    @Override
    @Transactional
    public Grade getGradeById(int id) {
        return gradeDao.getGradeById(id);
    }

    @Override
    @Transactional
    public Iterable<Grade> getGradesByStudentId(int studentId) {
        return gradeDao.getGradesByStudentId(studentId);
    }

    @Override
    public Iterable<Grade> getGradesBySubjectIdAndStudentId(int subjectId, int studentId) {
        return gradeDao.getGradesBySubjectIdAndStudentId( subjectId,  studentId);
    }


}
