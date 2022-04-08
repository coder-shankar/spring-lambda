package com.example.springlambda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableWebMvc
public class SimpleController {

    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public Map ping() {
        Map pong = new HashMap<>();
        pong.put("pong", "Hello, World!");
        return pong;
    }
}
