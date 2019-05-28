package com.jibrus.jibrus.models;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue
    private int user_id;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Students> students;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable=false)
    private Roles role;

    @OneToMany(mappedBy = "user")
    private List<Teacher> teachers;
}
