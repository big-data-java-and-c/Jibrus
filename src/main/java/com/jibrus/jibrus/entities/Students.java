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
    private int indeks;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private Users user;


    public Students() {
    }

    public Students(String displayName, Users user, int indeks) {
        this.displayName = displayName;
        this.user = user;
        this.indeks = indeks;
    }

    public Students(String displayName, String address, String city, String province,
                    String zip_code, String phone_number, int indeks, Users user) {
        this.displayName = displayName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip_code = zip_code;
        this.phone_number = phone_number;
        this.indeks = indeks;
        this.user = user;
    }

}
