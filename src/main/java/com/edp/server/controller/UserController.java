package com.edp.server.controller;

import com.edp.server.Repository.data.EdpUseRecord;
import com.edp.server.Repository.data.User;
import com.edp.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by daizhx on 2017/9/27.
 */
@RestController
@RequestMapping("/edp/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    //新增用户
    @PostMapping()
    public User saveUser(@RequestBody User user){
        return userService.signUp(user);
    }

    //修改用户
    @PutMapping()
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    //TODO 简单接口
    @GetMapping("/user/sign_in")
    public boolean login(String userName,String pwd){
        User u = userService.signIn(userName,pwd);
        if(u != null){
            return true;
        }else {
            return false;
        }
    }

    //TODO 用户使用EDP记录
    @PostMapping("/user/use_record")
    public boolean RecordEdpUsing(EdpUseRecord record){
        userService.recordEdpUse(record);
        return true;
    }

}
