package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Scope;

//@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    apple getaple(){
        return new apple();
    }
}
//second method to create bean