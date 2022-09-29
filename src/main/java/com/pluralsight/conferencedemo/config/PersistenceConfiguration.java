package com.pluralsight.conferencedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    //Main reason for these types of things are if you want to log stuff, or send an email. That's what configs can
    // be used for
//    @Bean
//    public DataSource dataSource() {
//
//    }
}
