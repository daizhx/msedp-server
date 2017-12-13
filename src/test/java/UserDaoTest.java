import com.edp.server.Application;
import com.edp.server.Repository.UserRepository;
import com.edp.server.Repository.data.User;
import org.hibernate.validator.constraints.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/11/11 0011.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserDaoTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setTel(18664701713L);
        user.setWeChatName("test");
        User u = repository.save(user);
        System.out.println("----------"+u.toString());
    }
}
