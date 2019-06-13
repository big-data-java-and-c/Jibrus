package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDao extends CrudRepository<Teacher,Long> {
    Teacher getTeacherById(int id);
}
