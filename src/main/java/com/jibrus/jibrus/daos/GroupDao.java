package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Groups;

public interface GroupDao {
    Groups getGroupById(int id);
    Iterable<Groups> getAllGroups();
}
