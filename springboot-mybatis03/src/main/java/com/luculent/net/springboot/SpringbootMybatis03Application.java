package com.luculent.net.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luculent.net.springboot.mapper")
public class SpringbootMybatis03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis03Application.class, args);
    }

}
