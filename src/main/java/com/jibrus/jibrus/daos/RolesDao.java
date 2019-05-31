package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Roles;

public interface RolesDao {
    Roles getRole(String name);
    Roles getRoleById(int id);
}
