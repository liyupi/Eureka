package com.yupi.eurekaconsumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: Yupi Li
 * @Date: Created in 13:46 2018/9/20
 * @Description:
 * @Modified By:
 */
@Service
public class OrderService {

    @Resource
    private RestTemplate restTemplate;

    public String getOrder() {
        return restTemplate.getForObject("http://eureka-provider/member", String.class) + "order";
    }
}
