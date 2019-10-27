package com.hunter.hello.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: Hunter
 * @create: 2019-10-27 19:13
 **/
@FeignClient("hello-spring-cloud-service-admin")
public interface AdminService {

    @GetMapping("hi")
    String sayHi(@RequestParam String message);
}
