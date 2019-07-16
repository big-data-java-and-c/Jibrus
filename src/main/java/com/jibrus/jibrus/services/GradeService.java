package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Grade;

public interface GradeService {
    Grade getGradeById(int id);
    Iterable<Grade> getGradesByStudentId(int studentId);
    Iterable<Grade> getGradesBySubjectIdAndStudentId(int subjectId, int studentId);
    Iterable<Integer> getGradesValueBySubjectIdAndStudentId(int subjectId, int studentId);
}
