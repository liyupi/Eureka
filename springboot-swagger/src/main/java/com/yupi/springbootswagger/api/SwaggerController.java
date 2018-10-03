package com.yupi.springbootswagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yupi Li
 * @Date: Created in 15:14 2018/10/3
 * @Description:
 * @Modified By:
 */

@Api("Swagger Controller")
@RestController
public class SwaggerController {

    @ApiOperation("主页接口")
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @ApiOperation("带参数接口")
    @ApiImplicitParam(name = "username",value = "用户名",required = true,dataType = "String")
    @PostMapping("/param")
    public String getName(String username) {
        return username;
    }
}
