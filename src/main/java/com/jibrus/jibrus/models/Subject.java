package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue
    private int id_subject;
    private String name;
    private int value_ECTS;
}
