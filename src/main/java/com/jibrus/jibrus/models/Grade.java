package com.jibrus.jibrus.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Data
@Entity
public class Grade {
    @Id
    @GeneratedValue
    private int id_grade;
    private int value_grade;
    private Date date_received;
    private int student_id;
    private int teacher_id;
    private int subject_id;

}
