package com.dream.demo.springbootreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringBootReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReactApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
}
