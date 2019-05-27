package com.jibrus.jibrus.models;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private int user_id;
    private String email;
    private String password;
    private int roles_id;
}
