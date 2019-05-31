package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
