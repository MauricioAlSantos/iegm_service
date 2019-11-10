package br.gov.ma.tce.iegm.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class IegmServer {
	public static void main(String[] args) {
		SpringApplication.run(IegmServer.class, args);
	}

}
