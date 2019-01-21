package com.qfedu.schoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ImportResource("classpath:ncustomer.xml")
@SpringBootApplication
public class SchoolappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolappApplication.class, args);
    }

}

