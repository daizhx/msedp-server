package com.edp.server.controller;

import com.edp.server.data.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daizhx on 2017/9/27.
 */
@RestController
public class UserController {

    @RequestMapping("user/sign_up")
    public int saveUser(User user){

        return 0;
    }
}
