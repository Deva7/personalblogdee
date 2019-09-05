package com.BlogForDevlin.personalblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: personalblog
 * @author: Devlin
 * @create: 2019-08-03 22:02
 **/
@SpringBootApplication(scanBasePackages = "com.BlogForDevlin")
@MapperScan("com.BlogForDevlin.mapper")
public class PersonalblogApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalblogApplication.class, args);

    }
}
