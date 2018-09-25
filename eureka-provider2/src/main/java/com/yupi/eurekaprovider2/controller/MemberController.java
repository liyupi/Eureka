package com.yupi.eurekaprovider2.controller;

import com.yupi.eurekaprovider2.service.MemberSerivce;
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
public class MemberController {

    @Resource
    private MemberSerivce memberSerivce;

    @RequestMapping(value = "member",method = RequestMethod.GET)
    String getMember() {
        return memberSerivce.getMember();
    }
}
