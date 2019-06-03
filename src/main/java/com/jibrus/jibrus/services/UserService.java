package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Users;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {
    Users getUserById(int id);
   // UserDetails getUserByEmail(String username);
}
