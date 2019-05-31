package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.entities.Students;
import com.jibrus.jibrus.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentEndpoint {
    private StudentService studentService;

    @Autowired
    public StudentEndpoint(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/student/add")
    public ResponseEntity<Students> addStudent(@RequestBody Students student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/student/{id}")
    public ResponseEntity<Students> getStudent(@PathVariable int id) {
        Students student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
