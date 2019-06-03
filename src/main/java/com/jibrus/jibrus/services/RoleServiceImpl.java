package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.RolesDao;
import com.jibrus.jibrus.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RolesDao roleDao;

    @Override
    public Role getRole(String name) {
        return roleDao.getRole(name);
    }

    @Override
    public Role getRoleById(int id) {
        return roleDao.getRoleById(id);
    }
}
