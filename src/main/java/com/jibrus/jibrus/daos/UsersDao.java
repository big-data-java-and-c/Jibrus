package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Users;
import org.springframework.stereotype.Repository;


public interface UsersDao {
    Users getUserById(int id);
}
