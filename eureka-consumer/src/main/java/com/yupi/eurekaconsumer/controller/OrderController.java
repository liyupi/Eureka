package com.yupi.eurekaconsumer.controller;

import com.yupi.eurekaconsumer.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Yupi Li
 * @Date: Created in 13:45 2018/9/20
 * @Description:
 * @Modified By:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping(value = "order", method = RequestMethod.GET)
    String getOrder() {
        return orderService.getOrder();
    }
}
