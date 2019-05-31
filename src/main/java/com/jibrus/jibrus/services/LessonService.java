package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Lesson;

import java.util.List;

public interface LessonService {
    Lesson getLessonById(int id);

    List<Lesson> getLessonBySubjectId(int id);

    List<Lesson> getLessonByGroupId(int id);

    List<Lesson> getLessonByTeacherId(int id);
}
