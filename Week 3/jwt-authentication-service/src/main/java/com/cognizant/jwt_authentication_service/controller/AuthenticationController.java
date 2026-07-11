package com.cognizant.jwt_authentication_service.controller;

import com.cognizant.jwt_authentication_service.model.AuthenticationResponse;
import com.cognizant.jwt_authentication_service.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    private final JwtUtil jwtUtil = new JwtUtil();

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        // Remove "Basic "
        String base64Credentials = authHeader.substring(6);

        // Decode username:password
        byte[] decodedBytes =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        String username = credentials.split(":")[0];

        String token = jwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}