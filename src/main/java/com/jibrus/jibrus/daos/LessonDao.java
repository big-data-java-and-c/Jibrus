package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Lesson;

import java.util.List;

public interface LessonDao {
    Lesson getLessonById(int id);

    List<Lesson> getLessonBySubjectId(int id);

    List<Lesson> getLessonByGroupId(int id);

    List<Lesson> getLessonByTeacherId(int id);
}
