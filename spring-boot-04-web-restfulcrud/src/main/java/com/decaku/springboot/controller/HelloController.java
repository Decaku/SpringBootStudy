package com.decaku.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    // 查出一些数据 在页面展示
    @RequestMapping("/success")
    public String success(Map<String, Object> ma) {
        ma.put("hello", "你好");
        return "success";
    }
}
