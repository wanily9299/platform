package com.zhouwei.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhouwei on 2017/3/1.
 */
@SpringBootApplication
//@SpringBootConfiguration
//@MapperScan(basePackages = "com.zhouwei.platform.mapper")
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
