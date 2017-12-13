package com.edp.server.dao;

import com.edp.server.Repository.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by daizhx on 2017/11/1.
 */
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //新建一个用户
    public void save(User user){

    }
}
