package com.jzfb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.jzfb.springcloud"})
@ComponentScan("com.jzfb.springcloud")
public class AppClient
{
	public static void main(String[] args)
	{
		SpringApplication.run(AppClient.class, args);
	}
}
