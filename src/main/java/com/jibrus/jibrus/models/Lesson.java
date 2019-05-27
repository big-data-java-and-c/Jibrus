package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
}
