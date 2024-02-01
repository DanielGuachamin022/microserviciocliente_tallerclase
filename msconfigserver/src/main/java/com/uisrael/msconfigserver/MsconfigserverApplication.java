package com.uisrael.msconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsconfigserverApplication.class, args);
	}

}
