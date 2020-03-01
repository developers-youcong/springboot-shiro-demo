package com.blog;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.blog.core.dao"}) //扫描DAO
public class BlogApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(BlogApplication.class, args);
    }
}
