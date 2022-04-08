package com.example.springlambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class SpringLambdaApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(SpringLambdaApplication.class, args);
    }

}
