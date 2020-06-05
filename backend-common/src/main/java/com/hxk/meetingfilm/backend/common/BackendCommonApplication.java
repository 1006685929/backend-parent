package com.hxk.meetingfilm.backend.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hxk.meetingfilm.common.dao.mapper"})
public class BackendCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendCommonApplication.class, args);
    }

}
