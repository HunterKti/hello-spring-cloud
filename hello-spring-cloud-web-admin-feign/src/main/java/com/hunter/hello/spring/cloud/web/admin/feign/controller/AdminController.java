package com.hunter.hello.spring.cloud.web.admin.feign.controller;

import com.hunter.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Hunter
 * @create: 2019-10-27 19:14
 **/
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
