package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Grade {
    @Id
    @GeneratedValue
    private int id_grade;
    private int value_grade;
    private Date date_received;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable=false)
    private Students student;
    // private int student_id;
    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable=false)
    private Teacher teacher;
    //   private int teacher_id;
    @ManyToOne
    @JoinColumn(name = "subject_id", nullable=false)
    private Subject subject;
    // private int subject_id;
}
