package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.RolesDao;
import com.jibrus.jibrus.entities.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RolesDao roleDao;

    @Override
    public Roles getRole(String name) {
        return roleDao.getRole(name);
    }

    @Override
    public Roles getRoleById(int id) {
        return roleDao.getRoleById(id);
    }
}
