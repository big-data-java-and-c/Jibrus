package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private int id_lesson;
    private Date date_lesson;
    private int id_teacher;
    private String sign_hall;
    private int id_subject;
    private int id_group;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable=false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "id_subject", nullable=false, insertable = false, updatable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "id_group", nullable=false, insertable = false, updatable = false )
    private Groups group;
}
