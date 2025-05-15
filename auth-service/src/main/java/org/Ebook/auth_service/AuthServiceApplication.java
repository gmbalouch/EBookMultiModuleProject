package org.Ebook.auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.Ebook.auth_service.repository")
@EntityScan(basePackages = "org.Ebook.common_entities.entities")
@ComponentScan(basePackages = {
		"org.Ebook.auth_service",
		"org.Ebook.common_entities",
		"org.Ebook.common_entities.exception"
})
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

}
