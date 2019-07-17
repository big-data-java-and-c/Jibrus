package com.jibrus.jibrus.dto;

import com.jibrus.jibrus.entities.Grade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class SubjectDto {

    private int id_subject;
    private String name;
}
