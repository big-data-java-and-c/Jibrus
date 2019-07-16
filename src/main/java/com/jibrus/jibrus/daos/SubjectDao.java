package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;

public interface SubjectDao {
    Iterable<SubjectDto> getAllSubjects();
}
