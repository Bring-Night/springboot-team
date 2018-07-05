package com.zhy.team.controller;

import com.zhy.team.bean.User;
import com.zhy.team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhy on 2018/6/25 0025.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/login")
    public String login(@RequestBody  User user){
        Map<String, Object> resultMap = new HashMap<>();
        String userAccount = user.getUserAccount();
        User  userinfo = new User();
        userinfo.setUserAccount(userAccount);
        resultMap.put("user",userinfo);
        return resultMap.toString();
    }
}
