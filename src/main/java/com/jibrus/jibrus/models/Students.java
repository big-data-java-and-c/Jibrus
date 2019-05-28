package com.jibrus.jibrus.models;

import lombok.Data;
import org.h2.engine.User;

import javax.persistence.*;
import java.security.acl.Group;
import java.util.List;

@Data
@Entity
public class Students {
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
    @OneToMany(mappedBy ="student")
    private List<Grade> grade;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "id_group", nullable=false)
    private Groups group;


}
