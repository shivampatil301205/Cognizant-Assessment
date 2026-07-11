package com.cognizant.jwt_authentication_service.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // Secret key (must be at least 32 characters for HS256)
    private static final String SECRET =
            "mysecretkeymysecretkeymysecretkey123";

    private static final Key SECRET_KEY =
            Keys.hmacShaKeyFor(SECRET.getBytes());

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SECRET_KEY)
                .compact();
    }
}