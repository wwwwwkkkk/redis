package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "Hello, World!";
    }
}

