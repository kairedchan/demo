package com.greatmap.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Company: 武汉天耀宏图科技有限公司
 * Project name: demo
 * Create Time: 2020-12-23
 *
 * @author 陈凯红 chenkaihong@greatemap.com.cn
 * Description
 **/
@RestController
@Api(description = "测试标签")
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String index() {
        return "hello, world";
    }

    @RequestMapping("/hello")
    @ApiOperation(value = "方法描述")
    public String hello() {
        return "./static/html/index.html";
    }

    @GetMapping("/article/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://EUREKA-CLIENT-USER-SERVICE/hello", String.class);
    }

}
