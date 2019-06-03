package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
  // @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @ManyToOne(targetEntity = Roles.class)
    private Roles role;

//    @JsonBackReference
//    @OneToMany(mappedBy = "user")
//    private List<Students> students;
//
//    @JsonBackReference
//    @OneToMany(mappedBy = "user")
//    private List<Teacher> teachers;
//
//    @JsonManagedReference
//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Roles role;

}
