package com.yupi.zuul2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
public class Zuul2Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul2Application.class, args);
    }

    @SpringBootApplication
    @EnableEurekaClient
    @EnableZuulProxy
    public static class ZuulApplication {

        public static void main(String[] args) {
            SpringApplication.run(ZuulApplication.class, args);
        }
    }
}
