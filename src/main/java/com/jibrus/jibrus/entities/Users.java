package com.jibrus.jibrus.entities;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Data
@Entity
@Table
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToOne(targetEntity = Role.class)
    private Role role;

    public Users() {
    }

    public Users(@Email String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }



}
