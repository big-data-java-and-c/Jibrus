package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.GradeDao;
import com.jibrus.jibrus.entities.Grade;
import com.jibrus.jibrus.exceptions.GradeDoesNotExist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {
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
        return gradeDao.getGradesBySubjectIdAndStudentId(subjectId, studentId);
    }

    @Override
    public Iterable<Integer> getGradesValueBySubjectIdAndStudentId(int subjectId, int studentId) {
        return gradeDao.getGradesValueBySubjectIdAndStudentId(subjectId, studentId);
    }

    @Override
    public void deleteGradeById(Integer grade_id) {
        Optional<Grade> grade = Optional.ofNullable(this.getGradeById(grade_id));
        if (!grade.isPresent()) {
            throw new GradeDoesNotExist("Nie znaleziono oceny o  id " + grade_id);
        }
        gradeDao.deleteById(grade_id);
    }

    @Override
    public void insertGrade(Grade grade) {
        gradeDao.insertGrade(grade);
    }

}
