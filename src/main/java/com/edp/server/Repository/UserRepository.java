package com.edp.server.Repository;

import com.edp.server.Repository.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
public interface UserRepository extends CrudRepository<User,Long>{
    
}
