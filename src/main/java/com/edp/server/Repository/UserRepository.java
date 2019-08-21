package com.edp.server.Repository;

import com.edp.server.Repository.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public interface UserRepository extends JpaRepository<User,Long> {

//    User findByUserNameAndPwd(String tel, String pwd);
}
