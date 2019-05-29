package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String province;
    private String zip_code;
    private String phone_number;

    @OneToMany(mappedBy ="student")
    private List<Grade> grade;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "id_group")
    private Groups group;


}
