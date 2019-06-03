package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Role;

public interface RolesDao {
    Role getRole(String name);
    Role getRoleById(int id);
}
