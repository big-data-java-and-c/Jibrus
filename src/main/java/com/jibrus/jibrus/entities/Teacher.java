package com.jibrus.jibrus.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user")
    private Users user;
    private Integer indeks;

    public Teacher(String name,  Users user, Integer indeks) {
        this.name = name;
        salary = 2500;
        this.user = user;
        this.indeks = indeks;
    }

    public Teacher() {
    }
}
