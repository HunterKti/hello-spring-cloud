package com.hunter.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Hunter
 * @create: 2019-10-27 18:55
 **/
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String syHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message,String.class);
    }
}
