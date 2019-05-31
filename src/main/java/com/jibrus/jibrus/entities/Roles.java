package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int role_id;
   
    private String role_type;

//    @JsonBackReference
//    @OneToMany(mappedBy = "role")
//    private List<Users> users;

    public Roles() {}

    public Roles(String name) {
        this.role_type = name;
    }
}
