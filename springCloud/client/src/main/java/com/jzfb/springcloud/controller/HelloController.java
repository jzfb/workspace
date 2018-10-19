package com.jzfb.springcloud.controller;

import com.jzfb.springcloud.entity.Hello;
import com.jzfb.springcloud.service.HelloClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloClientService helloClientService;

    @RequestMapping("/hello")
    public Hello hello(){
        return helloClientService.hello();
    }

}
