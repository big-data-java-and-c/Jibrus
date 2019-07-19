package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Grade;

public interface GradeDao {
    Grade getGradeById(int id);
    Iterable<Grade> getGradesByStudentId(int studentId);
    Iterable<Grade> getGradesBySubjectIdAndStudentId(int subjectId, int studentId);
    Iterable<Integer> getGradesValueBySubjectIdAndStudentId(int subjectId, int studentId);
    void deleteById(Integer grade_id);
    void insertGrade(Grade grade);
}
