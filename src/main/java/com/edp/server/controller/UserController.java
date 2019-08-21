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


    //@RequestParam 只能获取content-type为form-data,x-www.form-urlencoded POST的参数
    //通过json POST的参数只能通过@RequestBody 接收到java bean中
//    @PostMapping("/login")
//    public boolean login(@RequestBody User user){
//        System.out.println(user.toString());
//        User u = userService.signIn(user.getUserName(),user.getPwd());
//        if(u != null){
//            return true;
//        }else {
//            return false;
//        }
//    }

    //用户使用EDP记录
    @PostMapping("/edp_record")
    public boolean RecordEdpUsing(EdpUseRecord record){
        userService.recordEdpUse(record);
        return true;
    }

}
