package com.yupi.eurekaconsumer.controller;

import com.spring4all.swagger.EnableSwagger2Doc;
import com.yupi.eurekaconsumer.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@EnableSwagger2Doc
@Api("订单服务")
public class OrderController {

    @Resource
    private OrderService orderService;

    @ApiOperation("获得订单")
    @RequestMapping(value = "order", method = RequestMethod.GET)
    String getOrder() {
        return orderService.getOrder();
    }
}
