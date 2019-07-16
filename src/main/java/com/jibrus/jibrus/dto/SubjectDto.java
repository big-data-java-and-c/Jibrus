package com.jibrus.jibrus.dto;

import com.jibrus.jibrus.entities.Grade;
import lombok.Data;

import java.util.List;

@Data
public class SubjectDto {

    private int id_subject;
    private String name;
    private int value_ECTS;
    private List<Grade> grade;
}
