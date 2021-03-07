package com.springsec.springjwtsecure.service;

import com.springsec.springjwtsecure.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(Long id);

    void delete(Long id);

}
