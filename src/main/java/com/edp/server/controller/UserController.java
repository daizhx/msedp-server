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
    public int saveUser(@RequestBody User user){
        User ret = userService.signUp(user);
        if(ret.getId() != null){
            return 1;
        }
        return 0;
    }
}
