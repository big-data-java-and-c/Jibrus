package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RolesDaoImpl implements RolesDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public Role getRole(String name) {
        return  (Role) entityManager.createQuery("FROM Role where role_type =: name")
                .setParameter("name", name)
                .getSingleResult();

    }

    @Override
    public Role getRoleById(int id) {
        return (Role) entityManager.createQuery("FROM Role where id =: id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
