package com.example.spring.service;

import com.example.spring.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;

@Service
@Slf4j
public class UseServiceimpl implements UseService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public String add() {
        return "1";


    }





}
