package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UsersDaooldTODELETEImpl implements UserDaoold {

    @Autowired
    private EntityManager entityManager;

    public Users getUserById(int id) {
        return (Users) entityManager.createQuery("FROM Users WHERE user_id =: id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Users getUserByEmail(String email) {
        return (Users) entityManager.createQuery("FROM Users WHERE email =: email")
                .setParameter("email", email)
                .getSingleResult();
    }

}
