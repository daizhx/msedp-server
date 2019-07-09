package com.edp.server;

import com.edp.server.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by daizhx on 2017/9/26.
 */
//开启组件扫描和自动配置，等同于@Configuration,@ComponentScan,@EnableAutoConfiguration3个注解
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
