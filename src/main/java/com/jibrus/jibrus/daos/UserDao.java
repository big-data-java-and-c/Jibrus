package com.jibrus.jibrus.daos;

import com.jibrus.jibrus.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<Users,Long> {
    Optional<Users> getByEmail(String email);
    Boolean existsByEmail(String email);

}
