package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.entities.Students;
import com.jibrus.jibrus.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
    public ResponseEntity<Students> getStudent(@PathVariable Integer id) {
        Students student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
//    @RequestMapping(method = RequestMethod.GET, path = "/students")
//    public ResponseEntity<List<Students>> getAllStudents() {
//        List<Students> students = studentService.getAllStudents();
//        return new ResponseEntity<>(students, HttpStatus.OK);
//    }

    @GetMapping("/students")
    public ResponseEntity getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
