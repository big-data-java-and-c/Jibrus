package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Teacher_nn_subject {
    private int id_teacher;
    private int id_subject;
}
