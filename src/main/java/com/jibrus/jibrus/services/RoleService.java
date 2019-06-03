package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Role;

public interface RoleService {
    Role getRole(String name);
    Role getRoleById(int id);
}
