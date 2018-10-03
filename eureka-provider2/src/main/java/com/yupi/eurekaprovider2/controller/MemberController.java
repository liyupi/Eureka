package com.yupi.eurekaprovider2.controller;

import com.spring4all.swagger.EnableSwagger2Doc;
import com.yupi.eurekaprovider2.service.MemberSerivce;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Yupi Li
 * @Date: Created in 13:38 2018/9/20
 * @Description:
 * @Modified By:
 */
@RestController
@EnableSwagger2Doc
@Api("会员服务2")
public class MemberController {

    @Resource
    private MemberSerivce memberSerivce;

    @ApiOperation("获得会员")
    @RequestMapping(value = "member",method = RequestMethod.GET)
    String getMember() {
        return memberSerivce.getMember();
    }
}
