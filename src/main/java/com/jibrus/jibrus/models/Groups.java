package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Groups {
    @Id
    @GeneratedValue
    private int id_group;
    private String name_grupy;

    @OneToMany(mappedBy ="group")
    private List<Lesson> lessons;

    @OneToMany(mappedBy ="group")
    private List<Students> students;
}
