package com.yupi.consulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ConsulClientApplication {

    @RequestMapping("/member")
    String getMember() {
        return "member";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientApplication.class, args);
    }
}
