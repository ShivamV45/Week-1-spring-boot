package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;

public class DBService {
    @Autowired
    DevDB db;

    String getData() {
     return db.getData();
    }
}
