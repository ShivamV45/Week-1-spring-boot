package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class apple {
    void eatApple(){
        System.out.println("I am eating the apple");
    }
    //before starting the application
    @PostConstruct
    void callThisBeforeUse() {
        System.out.println("Creating the apple before use");
    }
   //after starting the application
    @PreDestroy
    void CallThisafterUse(){
        System.out.println("call this after application is used");
    }


}
//first method to create bean