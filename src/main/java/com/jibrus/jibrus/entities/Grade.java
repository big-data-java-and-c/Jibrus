package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
//@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id_grade")
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_grade;
    private int value_grade;

    private String date_received;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "student_id", nullable=false)
    private Students student;
    // private int id;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable=false)
    private Teacher teacher;
    //   private int teacher_id;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "subject_id", nullable=false)
    private Subject subject;
    // private int subject_id;


   // public int getValue_grade() {        return value_grade;    }
}
