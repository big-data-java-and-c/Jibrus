package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_teacher;
    private String Name;
    private String Second_name;
    private int Salary;

    @OneToOne
    @JoinColumn(name = "user")
    private Users user;

//    @JsonManagedReference
//    @ManyToOne
//    @JoinColumn(name = "id", nullable=false)
//    private Users user;
//
//    @JsonBackReference
//    @OneToMany(mappedBy ="teacher")
//    private List<Grade> grades;
//
//    @JsonBackReference
//    @OneToMany(mappedBy ="teacher")
//    private List<Lesson> lessons;
}
