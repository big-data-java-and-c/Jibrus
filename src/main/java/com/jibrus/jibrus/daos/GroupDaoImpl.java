package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GroupDaoImpl implements GroupDao{
    @Autowired
    private EntityManager entityManager;

    public String getGroupById(int id) {
        return  entityManager.createQuery("FROM Groups WHERE id_group =: id")
                .setParameter("id", id)
                .getSingleResult().toString();
    }

    @Override public Iterable<Groups> getAllGroups() {
        return entityManager.createQuery("FROM Groups")
                .getResultList();
    }
}
