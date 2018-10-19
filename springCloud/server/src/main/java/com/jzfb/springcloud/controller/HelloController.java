package com.jzfb.springcloud.controller;

import com.jzfb.springcloud.entity.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Hello hello(){
        return new Hello(1,"hello","hello world;");
    }

}
