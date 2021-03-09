package com.kbcss.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("userServiceFallBack")
    public String userServiceFallbackMethod(){
        return "User Service taking longer than expected please try later";
    }
    @GetMapping("departmentServiceFallBack")
    public String departmentServiceFallbackMethod(){
        return "User Service taking longer than expected please try later";
    }
}
