package com.greatmap.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company: 武汉天耀宏图科技有限公司
 * Project name: demo
 * Create Time: 2020-12-23
 *
 * @author 陈凯红 chenkaihong@greatemap.com.cn
 * Description
 **/
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello, world";
    }

}
