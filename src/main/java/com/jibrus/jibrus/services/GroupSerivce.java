package com.jibrus.jibrus.services;

import com.jibrus.jibrus.entities.Groups;

public interface GroupSerivce {
    Groups getGroupById(int id);

    Iterable<Groups> getAllGroups();
}
