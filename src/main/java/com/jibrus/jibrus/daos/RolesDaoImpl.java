package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RolesDaoImpl implements RolesDao {
    @Autowired
    EntityManager entityManager;


    @Override
    public Roles getRole(String name) {
        return (Roles) entityManager.createQuery("FROM Roles where role_type =: name")
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public Roles getRoleById(int id) {
        return (Roles) entityManager.createQuery("FROM Role where role_id =: id")
                .setParameter("role_id", id)
                .getSingleResult();
    }
}
