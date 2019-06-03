package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.UsersDao;
import com.jibrus.jibrus.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional
    public Users getUserById(int id) {
        return usersDao.getUserById(id);
    }


}
