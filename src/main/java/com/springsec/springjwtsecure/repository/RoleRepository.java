package com.springsec.springjwtsecure.repository;




/*
 * @author
 * @version
 * @return
 */


import com.springsec.springjwtsecure.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
