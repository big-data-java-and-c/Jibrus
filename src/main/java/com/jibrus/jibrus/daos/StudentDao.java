package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends CrudRepository<Students,Long> {

}
