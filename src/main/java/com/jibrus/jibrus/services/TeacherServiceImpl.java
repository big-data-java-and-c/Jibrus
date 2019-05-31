package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.TeacherDao;
import com.jibrus.jibrus.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherDao teacherDao;

    @Override
    @Transactional
    public Teacher getTeacherById(int id) {
        return teacherDao.getTeacherById(id);
    }
}
