package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Group {
    @Id
    @GeneratedValue
    private int id_group;
    private String name_grupy;
}
