package com.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaclientApplication {

	public static void main(String[] args) throws InterruptedException{
		SpringApplication.run(EurekaclientApplication.class, args);
		//Thread.sleep(50000);
	}

}
