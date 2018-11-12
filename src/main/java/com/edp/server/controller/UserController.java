package com.edp.server.controller;

import com.edp.server.Repository.data.User;
import com.edp.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by daizhx on 2017/9/27.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/sign_up")
    public User saveUser(@RequestBody User user){
        return userService.signUp(user);
    }

    @GetMapping("/user/sign_in")
    public boolean login(String account,String pwd){
        User u = userService.signIn(account,pwd);
        if(u != null){
            return true;
        }else {
            return false;
        }
    }
}
