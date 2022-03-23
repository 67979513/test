package com.luculent.net.springboot.springbootjsp02.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/say")
    public String say(Model model){
        model.addAttribute("message","hello springboot");
        return "success";
    }
}
