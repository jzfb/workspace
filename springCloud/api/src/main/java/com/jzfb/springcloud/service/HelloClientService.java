package com.jzfb.springcloud.service;

import com.jzfb.springcloud.entity.Hello;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "APPSERVER",fallbackFactory = HelloClientServiceFallbackFactory.class)
public interface HelloClientService {
    @RequestMapping(value = "/hello")
    Hello hello();
}
