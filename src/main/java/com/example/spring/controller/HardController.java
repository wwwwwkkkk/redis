package com.example.spring.controller;

import com.example.spring.DTO.Teacher;
import com.example.spring.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HardController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/add")
    public String add(@RequestBody Teacher user) {
        userRepository.save(user);
       return ("添加");

    }
    @GetMapping("/select")
    public String select(@RequestParam Long id) {
        String teacher = (String) redisTemplate.opsForValue().get("Teacher");

        //从数据库查出来存redis

        //从redis中取出来

        if (teacher != null) {
            return "已存在";
        } else {
            List<Teacher> teacherList = userRepository.findAll();
            String str = teacherList.toString();
            //从redis中取出来
            redisTemplate.opsForValue().set("Teacher", teacherList);
            return str;
            }
    }
    @GetMapping("/update")
    public List update(@RequestParam Long gender){
        List<Teacher> teacherList = userRepository.findAll();
        return teacherList;
    }

}












