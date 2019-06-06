package com.tryouts.spring_cloud.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProtoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtoConfigServerApplication.class, args);
	}

}
