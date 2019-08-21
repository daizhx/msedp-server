package com.edp.server.service;

import com.edp.server.Repository.EdpUseRecordRepository;
import com.edp.server.Repository.UserRepository;
import com.edp.server.Repository.data.EdpUseRecord;
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

    @Autowired
    private EdpUseRecordRepository edpUseRecordRepository;

    //用户注册
    public User signUp(User u){
        return userRepository.save(u);
    }

    //用户登录
//    public User signIn(String userName,String pwd){
//        return userRepository.findByUserNameAndPwd(userName,pwd);
//    }

    //用户使用记录
    public EdpUseRecord recordEdpUse(EdpUseRecord record){
        return edpUseRecordRepository.save(record);
    }

    public User updateUser(User user){
        return userRepository.saveAndFlush(user);
    }
}
