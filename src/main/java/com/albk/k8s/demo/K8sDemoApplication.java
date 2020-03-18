package com.albk.k8s.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:04 上午
 */
@MapperScan({"com.albk.k8s.demo.persistent"})
@SpringBootApplication
public class K8sDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(K8sDemoApplication.class, args);
    }

}
