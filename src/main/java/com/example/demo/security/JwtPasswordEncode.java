package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class JwtPasswordEncode {
    public PasswordEncoder encoderPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
