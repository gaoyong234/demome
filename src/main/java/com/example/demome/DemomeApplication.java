package com.example.demome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demome.dao")
public class DemomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomeApplication.class, args);
        System.out.println("启动完成2");
    }

}
