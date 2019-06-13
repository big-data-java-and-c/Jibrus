package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Users;
import org.springframework.stereotype.Repository;


public interface UserDaoold {
    Users getUserById(int id);
    Users getUserByEmail(String email);
}
