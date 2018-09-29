package com.yupi.zkclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZkClient2Application {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/member")
    String getMember() {
        return "member2";
    }

    @RequestMapping("/order")
    String getOrder() {
        return "order" + restTemplate.getForObject("http://zk-client/member", String.class);
    }

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZkClient2Application.class, args);
    }
}
