package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(length = 60, name = "ROLE_TYPE")
    private RoleName name;

    public Role() {}

    public Role(String roleName) {
        this.name = RoleName.valueOf(roleName);
    }

    public Role(RoleName name) {
        this.name = name;
    }

}
