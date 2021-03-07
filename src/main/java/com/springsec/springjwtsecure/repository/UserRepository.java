package com.springsec.springjwtsecure.repository;

import com.springsec.springjwtsecure.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String name);

}
