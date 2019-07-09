package com.edp.server.controller;

import com.edp.server.Application;
import com.edp.server.Repository.data.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void saveUser() {
//        User u = new User();
//        u.setPwd("12312fkldkfl");
    }

    @Test
    public void login() {
    }
}