package com.jibrus.jibrus.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class GroupDaoImpl implements GroupDao{
    @Autowired
    private EntityManager entityManager;

    public String getGroupById(int id) {
        return  entityManager.createQuery("FROM Groups WHERE id_group =: id")
                .setParameter("id", id)
                .getSingleResult().toString();
    }

}
