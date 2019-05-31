package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Grade;

import java.util.List;

public interface GradeService {
    Grade getGradeById(int id);
    List<Grade> getGradesByStudentId(int studentId);
}
