package com.jibrus.jibrus.services;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> getAllSubjects();
}
