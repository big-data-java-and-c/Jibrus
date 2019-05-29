package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_teacher;
    private String Name;
    private String Second_name;
    private int Salary;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private Users user;

    @OneToMany(mappedBy ="teacher")
    private List<Grade> grades;

    @OneToMany(mappedBy ="teacher")
    private List<Lesson> lessons;
}
