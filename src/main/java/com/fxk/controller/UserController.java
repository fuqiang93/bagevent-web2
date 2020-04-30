package com.fxk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuqiang01
 * @date 2020/4/30 22:05
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
