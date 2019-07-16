package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    private String address;
    private String city;
    private String province;
    private String zip_code;
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Groups group;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "id_grade")
    private Grade grade;

    public Students() {
    }

    public Students(String displayName, Users user) {
        this.displayName = displayName;
        this.user = user;
    }

    public Students(String displayName, String address, String city, String province,
                    String zip_code, String phone_number, Users user) {
        this.displayName = displayName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip_code = zip_code;
        this.phone_number = phone_number;
        this.user = user;
    }

}
