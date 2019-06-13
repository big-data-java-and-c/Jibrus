package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.UserDaoold;
import com.jibrus.jibrus.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoold usersDaoTODELETE;

    @Override
    @Transactional
    public Users getUserById(int id) {
        return usersDaoTODELETE.getUserById(id);
    }


}
