package com.luculent.net.springboot.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    //1、使用注解获取自定义配置使用@Value("${school.name}")使用${}进行占位
    //2、将使用注解自定义配置的值赋值给属性，如下
    @Value("${school.name}")
    private String schoolName;

    @Value("${address}")
    private String address;

    @RequestMapping("/says")
    @ResponseBody
    public String index(){
        return "hello"+schoolName+address;

    }
}
