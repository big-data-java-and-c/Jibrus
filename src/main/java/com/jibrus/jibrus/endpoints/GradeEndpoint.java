package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/api/grade")
public class GradeEndpoint {

    private GradeService gradeService;

    @Autowired
    public GradeEndpoint(GradeService gradeService) {
        this.gradeService = gradeService;

    }

    @GetMapping("/all/{id}")
    public ResponseEntity getAllUserGrade(@PathVariable Integer id) {
        return ResponseEntity.ok(gradeService.getGradesByStudentId(id));
    }
}


