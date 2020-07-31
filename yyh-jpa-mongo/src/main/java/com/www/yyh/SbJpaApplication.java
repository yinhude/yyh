package com.www.yyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class SbJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbJpaApplication.class, args);
    }

}
