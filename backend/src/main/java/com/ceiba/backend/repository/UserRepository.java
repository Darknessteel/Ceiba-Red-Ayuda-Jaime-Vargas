package com.ceiba.backend.repository;

import com.ceiba.backend.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> { 

    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);

}
