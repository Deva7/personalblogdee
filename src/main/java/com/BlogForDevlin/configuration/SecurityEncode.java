package com.BlogForDevlin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @program: personalblog
 * @description: Security Encode Config
 * @author: Devlin
 * @create: 2019-09-05 23:38
 **/
public class SecurityEncode {
    // BrowerSecurityConfig
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
