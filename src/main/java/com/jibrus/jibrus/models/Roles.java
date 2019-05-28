package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Roles {
    @Id
    @GeneratedValue
    private int role_id;
    private String role_type;

    @OneToMany(mappedBy = "user_id")
    private List<Users> users;
}
