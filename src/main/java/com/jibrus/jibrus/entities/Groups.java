package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_group;
    private String name_grupy;

    @OneToMany(mappedBy ="group")
    private List<Lesson> lessons;

    @OneToMany(mappedBy ="group")
    private List<Students> students;
}
