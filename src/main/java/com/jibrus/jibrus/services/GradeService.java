package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Grade;

public interface GradeService {
    Grade getGradeById(int id);
    Iterable<Grade> getGradesByStudentId(int studentId);


}
