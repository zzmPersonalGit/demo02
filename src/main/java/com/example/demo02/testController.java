package com.example.demo02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        System.out.println("hello.java");
        return "hello.java";
    }
}
