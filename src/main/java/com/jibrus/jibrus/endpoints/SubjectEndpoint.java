package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.services.SubjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class SubjectEndpoint {

    private SubjectService subjectService;

    private ModelMapper modelMapper;

    @Autowired
    public SubjectEndpoint(SubjectService subjectService, ModelMapper modelMapper) {
        this.subjectService = subjectService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/subjects")
    public ResponseEntity<List<SubjectDto>> getAllSubjects(){
        List<SubjectDto> subjects = subjectService.getAllSubjects();
        
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }
}
