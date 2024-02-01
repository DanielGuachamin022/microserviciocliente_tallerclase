package com.uisrael.msdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsdiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsdiscoveryserverApplication.class, args);
	}

}
