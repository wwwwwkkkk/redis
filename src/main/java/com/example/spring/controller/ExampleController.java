package com.example.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class ExampleController {
    @RequestMapping("/de")
    public String de() {
        log.info("添加");
        return ("启动成功1");
    }
    @RequestMapping("/de1")
    public String de1() {
        log.info("删除");
        return ("启动成功2");

    }
    @RequestMapping("/de2")
    public String de2(){
        log.info("修改");
        return ("启动成功3");
    }
    @RequestMapping("/de3")
    public String de3(){
        log.info("查找");
        return ("启动成功4");
    }
}
