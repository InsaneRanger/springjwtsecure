package com.springsec.springjwtsecure.security.jwt;




/*
 * @author
 * @version
 * @return
 */


import com.springsec.springjwtsecure.model.Role;
import com.springsec.springjwtsecure.model.Status;
import com.springsec.springjwtsecure.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final class JWTUserFactory {

    public JWTUserFactory() {
    }

    public static JWTUser create(User user) {
        return new JWTUser(
                        user.getId(),
                        user.getUsername(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getEmail(),
                        user.getPassword(),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated(),
                mapToGrantedAuthority(user.getRoles())
                );
    }

    private static List<GrantedAuthority> mapToGrantedAuthority(List<Role> userRoles){
        return userRoles.stream()
                .map(role ->
                    new SimpleGrantedAuthority(role.getName())
                    ).collect(Collectors.toList());

    }
}
