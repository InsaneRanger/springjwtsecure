package com.springsec.springjwtsecure.security.jwt;




/*
 * @author
 * @version
 * @return
 */

import com.springsec.springjwtsecure.model.Role;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JWTTokenProvider {

    @Value("${jwt.token.secret}")
    private String secret;
    @Value("${jwt.token.expired}")
    private long validityMilliseconds;

    public String createToken(String username, List<Role> role){

    }
    public Authentication getAuthentication(String token) {

    }
    public String getUsername(String token){

    }
    public booleanvalidateToken(String token) {

    }
    private List<String> getRoleNames(List<Role> userRoles) {
        List<String> result = new ArrayList<>();

        userRoles.forEach(role -> {
            result.add(role.getName())
        });
        return result;
    }

 }
