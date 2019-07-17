package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;

import java.util.List;

public interface SubjectDao {
    List<SubjectDto> getAllSubjects();
}
