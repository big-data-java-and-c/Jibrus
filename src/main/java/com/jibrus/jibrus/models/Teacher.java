package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private int id_teacher;
    private String Name;
    private String Second_name;
    private int Salary;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private Users user;

    @OneToMany(mappedBy ="teacher")
    private List<Grade> grade;

    @ManyToOne
    @JoinColumn(name = "id_lesson", nullable=false)
    private Lesson lesson;
}
