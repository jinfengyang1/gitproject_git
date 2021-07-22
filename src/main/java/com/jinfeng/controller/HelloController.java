package com.jinfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hahha");
        return "hello !";
    }

    @ResponseBody
    @RequestMapping("/hi")
    public String hi() {
        System.out.println("hahahahh");
        return "hi";
    }

    @ResponseBody
    @RequestMapping("/hehe")
    public String hehe() {
        System.out.println("heheheheh");
        return "hehehe";
    }
}
