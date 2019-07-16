package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Grade;

import java.util.List;

public interface GradeDao {
    Grade getGradeById(int id);
    Iterable<Grade> getGradesByStudentId(int studentId);
    Iterable<Grade> getGradesBySubjectIdAndStudentId(int subjectId, int studentId);
}
