package com.hunter.hello.spring.cloud.web.admin.ribbon.controller;

import com.hunter.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Hunter
 * @create: 2019-10-27 18:58
 **/
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String syHi(String message){
        return adminService.syHi(message);
    }
}
