package es.caib.notib.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NotibmsConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotibmsConfigServiceApplication.class, args);
	}

}
