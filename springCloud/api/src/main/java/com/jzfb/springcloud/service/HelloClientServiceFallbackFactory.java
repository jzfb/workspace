package com.jzfb.springcloud.service;

import com.jzfb.springcloud.entity.Hello;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloClientServiceFallbackFactory implements FallbackFactory<HelloClientService> {

    @Override
    public HelloClientService create(Throwable throwable) {
        return new HelloClientService() {
            @Override
            public Hello hello() {
                return new Hello(0,"该信息未找到","no data of mysql");
            }
        };
    }
}
