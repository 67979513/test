package com.luculent.net.springboot.springboot.web;

import com.luculent.net.springboot.springboot.bean.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*表示该类会被spring中IOC容器所扫描*/
@Controller
public class IndexController {
    @Autowired
    private School school;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){

        return "hello,word"+school.getName()+school.getAddress();
    }
}
