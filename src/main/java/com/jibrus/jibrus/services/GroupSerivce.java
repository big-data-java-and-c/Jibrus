package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Groups;

public interface GroupSerivce {
    String getGroupById(int id);

    Iterable<Groups> getAllGroups();
}
