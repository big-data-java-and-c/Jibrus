package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private int id_teacher;
    private String Name;
    private String Second_name;
    private int Salary;
}
