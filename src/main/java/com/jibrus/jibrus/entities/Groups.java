package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Groups implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_group;
    private String name_grupy;

//    @JsonBackReference
//    @OneToMany(mappedBy ="group")
//    private List<Lesson> lessons;
//
//    @JsonBackReference
//    @OneToMany(mappedBy ="group")
//    private List<Students> students;
}
