package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Roles;

public interface RoleService {
    Roles getRole(String name);
    Roles getRoleById(int id);
}
