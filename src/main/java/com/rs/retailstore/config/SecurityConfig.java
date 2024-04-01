package com.rs.retailstore.config;


//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.builder()
                .username("thanhdatpb")
                .password("{bcrypt}$2a$10$RsuVicQPTO3y9NyAK3NdreGQBRBWi27mH90ENeJ9oyXj6C9yOG32u")
//                .roles(USER)
                .build();
        UserDetails admin = User.builder()
                .username("thanhdatadmin")
                .password("{bcrypt}$2a$10$escugug.KeCKOsopfjZfaeO9fnTPY/tciI12zppdHIWa7uTYfQCn.")
    //                .roles(USER, ADMIN)
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
}
