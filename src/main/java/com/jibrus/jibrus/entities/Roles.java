package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int role_id;
    private String role_type;

    @OneToMany(mappedBy = "role")
    private List<Users> users;
}
