package com.edp.server.service;

import com.edp.server.Application;
import com.edp.server.Repository.data.EdpUseRecord;
import com.edp.server.Repository.data.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void signUp() {
        User u = new User();
        u.setBirthday(new Date());
        u.setGender((byte) 0);
        u.setTel("0001");
        u.setCitizen_id("123");
        u.setEmail("123@qq.com");
        u.setNick_name("ad");
        u.setUser_name("daizhx");
        userService.signUp(u);
    }

    @Test
    public void edpUseRecord() {
        EdpUseRecord r = new EdpUseRecord();
        r.setDuration((byte) 10);
        r.setFreq((byte) 20);
        r.setStrength((byte) 30);
        r.setDev_uuid("xxx");
        r.setStart_time(new Date());
        userService.recordEdpUse(r);
    }
}