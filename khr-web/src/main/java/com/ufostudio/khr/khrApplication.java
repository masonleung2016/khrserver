package com.ufostudio.khr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: LCF
 * @Date: 2020/7/7 10:35
 * @Package: com.ufostudio.khr
 */

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.ufostudio.khr.mapper")
@EnableScheduling
public class khrApplication {

    public static void main(String[] args) {
        SpringApplication.run(khrApplication.class, args);
    }

}
