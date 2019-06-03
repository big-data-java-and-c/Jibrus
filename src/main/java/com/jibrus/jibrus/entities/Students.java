package com.jibrus.jibrus.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
        private String province;
    private String zip_code;
    private String phone_number;

    @OneToOne
    @JoinColumn(name = "user")
    private Users user;
    //    //   @JsonIgnore
//  //  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @JsonBackReference
//    @OneToMany(mappedBy = "student")
//    private List<Grade> grade;
//    //  @JsonIgnore
//  //  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @JsonManagedReference
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private Users user;
//    //  @JsonIgnore
//    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @JsonManagedReference
//    @ManyToOne
//    @JoinColumn(name = "id_group")
//    private Groups group;


    public Students() {
    }

    public Students(String first_name, String last_name, String address,
                    String city, String province, String zip_code, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip_code = zip_code;
        this.phone_number = phone_number;
    }


}
