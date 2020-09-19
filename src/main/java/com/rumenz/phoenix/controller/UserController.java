package com.rumenz.phoenix.controller;


import com.rumenz.phoenix.entity.User;
import com.rumenz.phoenix.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("index")
    public String index(){
        User user = userMapper.selectById(1);
        return user.toString();
    }
}
