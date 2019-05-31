package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String email;
    private String password;

    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Students> students;

    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Teacher> teachers;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;

}
