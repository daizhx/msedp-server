package com.edp.server.service;

import com.edp.server.Application;
import com.edp.server.Repository.data.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void signUp() {
//        User user = new User();
//        user.setTel(18664701713L);
//        user.setWechatname("test");
//        userService.signUp(user);
    }
}