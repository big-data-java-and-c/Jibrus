package com.jibrus.jibrus.entities;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Students> students;


    @OneToMany(mappedBy = "user")
    private List<Teacher> teachers;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;

}
