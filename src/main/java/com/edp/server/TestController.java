package com.edp.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by daizhx on 2017/9/26.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
