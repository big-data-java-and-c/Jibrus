package com.jibrus.jibrus.services;

import com.jibrus.jibrus.converters.SubjectEntityToSubjectDtoConverter;
import com.jibrus.jibrus.daos.SubjectDao;
import com.jibrus.jibrus.daos.SubjectRepository;
import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectEntityToSubjectDtoConverter converter;

    @Override
    public List<SubjectDto> getAllSubjects() {
        List<Subject> subjectsFromRepository = subjectRepository.findAll();
        return converter.convert(subjectsFromRepository);
    }

}
