package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_subject;
    private String name;
    private int value_ECTS;

    @ManyToMany
    @JoinTable(
            name = "teacher_nn_subject",
            joinColumns = @JoinColumn(name = "id_subject"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    Set<Teacher> teachers;

    @JsonBackReference
    @OneToMany(mappedBy ="subject")
    private List<Grade> grade;

    @JsonBackReference
    @OneToMany(mappedBy ="subject")
    private List<Lesson> lessons;
}
