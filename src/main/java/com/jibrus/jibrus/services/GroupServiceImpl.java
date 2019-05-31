package com.jibrus.jibrus.services;

import com.jibrus.jibrus.daos.GroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GroupServiceImpl implements GroupSerivce {
    @Autowired
    private GroupDao groupDao;

    @Override
    @Transactional
    public String getGroupById(int id) {
        return groupDao.getGroupById(id);
    }
}
