package com.hacker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hacker.mapper")
@SpringBootApplication
public class RedisApplication {

    // XGROUP CREATE stream.orders g1 0 MKSTREAM
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

}
