package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class DevDB {
    String getData(){
        return "Dev data";
    }
}
