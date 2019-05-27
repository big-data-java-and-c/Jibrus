package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Roles {
    @Id
    @GeneratedValue
    private int role_id;
    private String role_type;
}
