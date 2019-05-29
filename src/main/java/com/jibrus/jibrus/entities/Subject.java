package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_subject;
    private String name;
    private int value_ECTS;

    @ManyToMany
    @JoinTable(
            name = "teacher_nn_subject",
            joinColumns = @JoinColumn(name = "id_subject"),
            inverseJoinColumns = @JoinColumn(name = "id_teacher"))
    Set<Teacher> teachers;

    @OneToMany(mappedBy ="subject")
    private List<Grade> grade;

    @OneToMany(mappedBy ="subject")
    private List<Lesson> lessons;
}
