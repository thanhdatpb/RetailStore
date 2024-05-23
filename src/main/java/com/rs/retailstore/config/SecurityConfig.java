package com.rs.retailstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        UserDetails user = User.builder()
                .username("thanhdatpb")
                .password("$2a$10$Y3Zmb1XwpPiqvMJC.447dubKGn/mKrxbbzoxTU.S5fu.77pqGz7yW")
                .roles("USER")
                .build();
        UserDetails admin = User.builder()
                .username("thanhdatadmin")
                .password("$2a$10$Y3Zmb1XwpPiqvMJC.447dubKGn/mKrxbbzoxTU.S5fu.77pqGz7yW")
                .roles("USER", "ADMIN")
                .build();

        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
        users.createUser(user);
        users.createUser(admin);

        return users;
    }

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
