package com.rs.retailstore.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration

public class DataSourceConfig {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder <?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5432/Retail_Store");
        dataSourceBuilder.username("postgres");
        dataSourceBuilder.password("1234");

        return dataSourceBuilder.build();
    }

}
