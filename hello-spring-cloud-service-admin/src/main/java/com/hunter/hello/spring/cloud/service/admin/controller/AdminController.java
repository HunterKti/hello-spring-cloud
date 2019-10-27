package com.hunter.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Hunter
 * @create: 2019-10-27 18:18
 **/
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String syHi(String message){
        return String.format("your message is: %s port is: %s",message,port);
    }
}
