package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Groups;
import com.jibrus.jibrus.entities.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Students,Long> {

    Students findById(Integer id);
    Iterable<Students> findAll();
    Iterable<Students> findAllByGroup(Groups group);
//    getStudentIdByUserId
    Students findByUserId(Long id);

}
