package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Grade;

import java.util.List;

public interface GradeDao {
    Grade getGradeById(int id);
    List<Grade> getGradesByStudentId(int studentId);
}
