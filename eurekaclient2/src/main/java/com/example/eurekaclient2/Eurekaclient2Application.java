package com.example.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
//@EnableDiscoveryClient

public class Eurekaclient2Application {

	public static void main(String[] args){
		SpringApplication.run(Eurekaclient2Application.class, args);
		//Thread.sleep(50000);
	}

	@Bean
	public FirstFilter simplePreFilter(){
		return new FirstFilter();
	}

}
