package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao extends CrudRepository<Students,Long> {

}
