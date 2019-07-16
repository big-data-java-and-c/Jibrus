package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.SubjectDao;
import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public Iterable<SubjectDto> getAllSubjects() {
        return subjectDao.getAllSubjects();
    }
}
