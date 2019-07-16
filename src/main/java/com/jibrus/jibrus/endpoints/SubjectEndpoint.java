package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;
import com.jibrus.jibrus.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class SubjectEndpoint {

    private SubjectService subjectService;

    @Autowired
    public SubjectEndpoint(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/subjects")
    public Iterable<SubjectDto> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
}
