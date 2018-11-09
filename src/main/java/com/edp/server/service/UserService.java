package com.edp.server.service;

import com.edp.server.Repository.UserRepository;
import com.edp.server.Repository.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daizhx on 2017/9/27.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //用户注册
    public User signUp(User u){
        return userRepository.save(u);
    }

    //用户登录
    public int signIn(String account,String pwd){
        User u = userRepository.findByAccountAndPwd(account,pwd);
        return u.getId().intValue();
    }
}
