package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.LessonDao;
import com.jibrus.jibrus.entities.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class LessonServiceImpl implements LessonService{

    @Autowired
    private LessonDao lessonDao;
    @Override
    @Transactional
    public Lesson getLessonById(int id) {
        return lessonDao.getLessonById(id);
    }

    @Override
    @Transactional
    public List<Lesson> getLessonBySubjectId(int id) {
        return lessonDao.getLessonBySubjectId(id);
    }

    @Override
    @Transactional
    public List<Lesson> getLessonByGroupId(int id) {
        return lessonDao.getLessonByGroupId(id);
    }

    @Override
    @Transactional
    public List<Lesson> getLessonByTeacherId(int id) {
        return lessonDao.getLessonByTeacherId(id);
    }
}
