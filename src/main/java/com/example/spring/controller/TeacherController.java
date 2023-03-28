package com.example.spring.controller;

import com.example.spring.DTO.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {
    @Autowired
    private RedisTemplate redisTemplate;
    //添加redis到数据库
    @PostMapping("/set")
    public boolean SetTeacher(@RequestBody Teacher teacher) {
        redisTemplate.opsForValue().set("teacher",teacher);
        return redisTemplate.hasKey("teacher");
    }
    @GetMapping("/{key}")
    public Teacher GetTeacher(@PathVariable String key){
        return (Teacher) redisTemplate.opsForValue().get(key);
    }
    //删除操作
    @DeleteMapping("delete/{key}")
    public boolean DeleteTeacher(@PathVariable String key){
        redisTemplate.delete(key);
        return !redisTemplate.hasKey(key);
    }
    //修改操作
    @RequestMapping("/update{key}")
    public boolean updateTeacher(@PathVariable String key){
       return redisTemplate.hasKey(key);
    }
}
