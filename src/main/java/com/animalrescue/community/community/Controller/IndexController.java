package com.animalrescue.community.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //controller 允许这个类接受前端的请求
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
