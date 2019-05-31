package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Lesson implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_lesson;
    private Date date_lesson;
    private String sign_hall;


    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_subject")
    private Subject subject;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_group")
    private Groups group;
}
