package com.jibrus.jibrus.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int student_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String province;
    private String zip_code;
    private String phone_number;
    private int group_id;
}
