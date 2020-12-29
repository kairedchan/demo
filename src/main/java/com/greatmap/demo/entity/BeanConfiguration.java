package com.greatmap.demo.entity;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Company: 武汉天耀宏图科技有限公司
 * Project name: demo
 * Create Time: 2020-12-25
 *
 * @author 陈凯红 chenkaihong@greatemap.com.cn
 * Description
 **/
@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
