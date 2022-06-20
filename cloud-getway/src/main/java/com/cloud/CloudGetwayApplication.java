package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wdy
 * @version 1.0
 * @date 2022/6/17 11:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudGetwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGetwayApplication.class, args);
    }
}
