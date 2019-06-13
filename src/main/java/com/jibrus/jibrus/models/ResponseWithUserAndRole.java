package com.jibrus.jibrus.models;


import com.jibrus.jibrus.security.JwtResponse;
import lombok.Data;

@Data
public class ResponseWithUserAndRole {
    private JwtResponse response;
    private int roleId;
    private Long userId;

    public ResponseWithUserAndRole(JwtResponse response, int roleId, Long userId) {
        this.response = response;
        this.roleId = roleId;
        this.userId = userId;
    }
}

