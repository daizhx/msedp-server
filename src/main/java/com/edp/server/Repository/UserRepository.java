package com.edp.server.Repository;

import com.edp.server.Repository.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    //新建一个用户
    User save(User user);
}
