package com.jibrus.jibrus.services;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;

public interface SubjectService {
    Iterable<SubjectDto> getAllSubjects();
}
